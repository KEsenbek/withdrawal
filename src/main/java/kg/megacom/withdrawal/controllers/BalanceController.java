package kg.megacom.withdrawal.controllers;

import kg.megacom.withdrawal.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/balance")
public class BalanceController {
    @Autowired
    private BalanceService balanceService;

}
