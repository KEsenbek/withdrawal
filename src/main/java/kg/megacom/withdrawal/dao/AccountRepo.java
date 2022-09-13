package kg.megacom.withdrawal.dao;

import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {



    List<Account> findAllByClient(Client client);
    List<Account> findAccountByClient();

    Account findByAccount(long account);
}
