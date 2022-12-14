package kg.megacom.withdrawal.models.entities;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "nominals")
public class Nominal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int nominal;
    int amount;
}
