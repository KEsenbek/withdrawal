package kg.megacom.withdrawal.mappers;

import kg.megacom.withdrawal.mappers.base.BaseCrud;
import kg.megacom.withdrawal.models.dto.ClientDto;
import kg.megacom.withdrawal.models.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper extends BaseCrud<Client, ClientDto> {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
}
