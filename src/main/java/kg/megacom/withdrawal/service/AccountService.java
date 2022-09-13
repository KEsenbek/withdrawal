package kg.megacom.withdrawal.service;

import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.dto.WithdrawalResponse;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Client;

import java.util.List;

public interface AccountService {



    List<Account> findAllByClient(Client client);

    List<AccountDto> getAccount(Long clientId);

    WithdrawalResponse withdraw(long account, double sum);
}
