package kg.megacom.withdrawal.service.impl;

import kg.megacom.withdrawal.dao.AccountRepo;
import kg.megacom.withdrawal.mappers.AccountMapper;
import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.dto.NominalDto;
import kg.megacom.withdrawal.models.dto.WithdrawalResponse;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Balance;
import kg.megacom.withdrawal.models.entities.Client;
import kg.megacom.withdrawal.service.AccountService;
import kg.megacom.withdrawal.service.BalanceService;
import kg.megacom.withdrawal.service.NominalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private NominalService nominalService;
    @Autowired
    private BalanceService balanceService;

    private final AccountMapper accountMapper;

    public AccountServiceImpl() {
        this.accountMapper = AccountMapper.INSTANCE;
    }


    @Override
    public List<Account> findAllByClient(Client client) {

         List<Account> accounts = accountRepo.findAllByClient(client);
        return accounts;
    }

    @Override
    public List<AccountDto> getAccount(Long clientId) {
        List<Account> accounts = accountRepo.findAccountByClient();

        return accounts.
                stream().
                map(x->accountMapper.toDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public WithdrawalResponse withdraw(long account, double sum) {

        List<NominalDto> clientNominals = new ArrayList<>();

        Account clientAccount = accountRepo.findByAccount(account);
        double finalAmount = sum;

        if (clientAccount.getBalance().getBalance() < sum)
            throw new RuntimeException("Недостаточно средств!");

        List<NominalDto> nominalDtos = nominalService.findAllActiveNominals(sum);

        for ( NominalDto item: nominalDtos) {
            int rest = (int) (finalAmount / item.getNominal());
            int diff = rest - item.getAmount(); // хватает ли купюр

            finalAmount -= diff >= 0 ? item.getAmount() * item.getNominal() : rest * item.getNominal();

            item.setAmount(diff >= 0 ? item.getAmount() : rest );
            clientNominals.add(item);


            if (finalAmount == 0)
                break;
        }

        if (finalAmount != 0){
            throw new RuntimeException("Некорректная сумма!");
        }


        Balance balance = clientAccount.getBalance();
        balance.setBalance((int) (balance.getBalance() - sum));
        balanceService.save(balance);

        nominalService.refreshNominalCount(clientNominals);


        WithdrawalResponse response = new WithdrawalResponse();
        response.setAccount(account);
        response.setAmount((int) sum);
        response.setNominals(clientNominals);
        response.setRest((int) (clientAccount.getBalance().getBalance() - sum));


        return response;
    }
}

