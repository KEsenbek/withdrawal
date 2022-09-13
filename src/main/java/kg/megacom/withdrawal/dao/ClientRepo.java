package kg.megacom.withdrawal.dao;

import kg.megacom.withdrawal.models.dto.ClientDto;
import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {



}
