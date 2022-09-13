package kg.megacom.withdrawal.mappers;

import kg.megacom.withdrawal.mappers.base.BaseCrud;
import kg.megacom.withdrawal.models.dto.BalanceDto;
import kg.megacom.withdrawal.models.entities.Balance;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BalanceMapper extends BaseCrud<Balance, BalanceDto> {

    BalanceMapper INSTANCE = Mappers.getMapper(BalanceMapper.class);
}
