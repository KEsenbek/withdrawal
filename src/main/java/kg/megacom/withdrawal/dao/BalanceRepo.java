package kg.megacom.withdrawal.dao;

import kg.megacom.withdrawal.models.entities.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepo extends JpaRepository<Balance, Long> {


}
