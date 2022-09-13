package kg.megacom.withdrawal.controllers;

import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.dto.ClientInfoDto;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

   // @GetMapping("/info")
    //ClientInfoDto findAllAccountByClient (@RequestParam Long clientId) {return clientService.findAllAccountByClient(clientId);}

}
