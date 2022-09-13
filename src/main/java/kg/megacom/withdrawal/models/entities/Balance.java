package kg.megacom.withdrawal.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "balances")
public class Balance {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int balance;
}
