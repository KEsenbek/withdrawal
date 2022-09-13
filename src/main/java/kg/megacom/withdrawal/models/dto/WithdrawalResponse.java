package kg.megacom.withdrawal.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WithdrawalResponse {

    long account;
    int amount;
    int rest;
    List<NominalDto> nominals;
}
