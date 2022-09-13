package kg.megacom.withdrawal.models.dto;

import kg.megacom.withdrawal.models.entities.Account;
import kg.megacom.withdrawal.models.entities.Client;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Data
@FieldDefaults (level = AccessLevel.PRIVATE)



public class ClientInfoDto {

    ClientDto clientDto;
    List<AccountDto> accounts;



}
