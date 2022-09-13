package kg.megacom.withdrawal.mappers;

import com.sun.xml.bind.v2.util.StackRecorder;
import kg.megacom.withdrawal.models.dto.AccountDto;
import kg.megacom.withdrawal.models.entities.Account;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "balance.balance", target = "balance")
    AccountDto toDto (Account accounts);

    @InheritConfiguration
    Account toDto (AccountDto accountDto);

}
