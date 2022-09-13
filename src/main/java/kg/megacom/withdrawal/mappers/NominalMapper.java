package kg.megacom.withdrawal.mappers;

import kg.megacom.withdrawal.mappers.base.BaseCrud;
import kg.megacom.withdrawal.models.dto.NominalDto;
import kg.megacom.withdrawal.models.entities.Nominal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NominalMapper extends BaseCrud<Nominal, NominalDto> {

    NominalMapper INSTANCE = Mappers.getMapper(NominalMapper.class);

    List<NominalDto> toEntity (List<Nominal> nominals);
}
