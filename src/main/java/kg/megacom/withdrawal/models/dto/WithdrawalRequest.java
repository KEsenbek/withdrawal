package kg.megacom.withdrawal.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class WithdrawalRequest {
    long account;
    int amount;

}
