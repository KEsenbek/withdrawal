package kg.megacom.withdrawal.service;

import kg.megacom.withdrawal.models.dto.NominalDto;

import java.util.List;

public interface NominalService {

    List<NominalDto> findAllNominalCount(int maxNominal);

    void refreshNominalCount(List<NominalDto> nominalDtos);

    List<NominalDto> findAllActiveNominals(double sum);
}
