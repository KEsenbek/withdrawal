package kg.megacom.withdrawal.service.impl;

import kg.megacom.withdrawal.dao.BalanceRepo;
import kg.megacom.withdrawal.models.entities.Balance;
import kg.megacom.withdrawal.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private BalanceRepo balanceRepo;

    @Override
    public Balance save(Balance balance) {
        return balanceRepo.save(balance);
    }
}
