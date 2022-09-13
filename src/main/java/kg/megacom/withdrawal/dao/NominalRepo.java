package kg.megacom.withdrawal.dao;

import kg.megacom.withdrawal.models.entities.Nominal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NominalRepo extends JpaRepository<Nominal,Long> {

    @Query("select u from Nominal u where ?1 >= u.nominal and u.amount>0 order by u.nominal desc ")
    List<Nominal> findByNominalAndAmount(int amount);

    Nominal findByNominal(int nominal);
}
