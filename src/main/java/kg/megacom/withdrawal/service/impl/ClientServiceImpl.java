package kg.megacom.withdrawal.service.impl;

import kg.megacom.withdrawal.dao.AccountRepo;
import kg.megacom.withdrawal.dao.ClientRepo;
import kg.megacom.withdrawal.mappers.ClientMapper;
import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.dto.ClientDto;
import kg.megacom.withdrawal.models.dto.ClientInfoDto;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Client;
import kg.megacom.withdrawal.service.AccountService;
import kg.megacom.withdrawal.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountRepo accountRepo;

    private final ClientMapper clientMapper;



    public ClientServiceImpl() {

        this.clientMapper = ClientMapper.INSTANCE;
    }


//    @Override
//    public ClientInfoDto findAllAccountByClient(Long clientId) {
//
//
//        ClientDto clientDto = new ClientDto();
//        clientDto.setName(client.getName());
//
//
//        List<Account> accounts = accountRepo.findAllByClient(client);
//
//        ClientInfoDto clientInfoDto = new ClientInfoDto();
//        clientInfoDto.setClient(clientDto);
//        clientInfoDto.setAccounts(accounts);
//
//        return clientInfoDto;
//    }
}
