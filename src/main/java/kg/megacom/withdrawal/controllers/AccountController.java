package kg.megacom.withdrawal.controllers;

import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.dto.WithdrawalRequest;
import kg.megacom.withdrawal.models.dto.WithdrawalResponse;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/get")
    public List<AccountDto> findClient (@RequestParam Long clientId) {return accountService.getAccount(clientId);}

    @GetMapping("/withdrawal")
    public WithdrawalResponse withdrawal (@RequestParam long account, @RequestParam int sum) {return accountService.withdraw(account,sum);}


}
