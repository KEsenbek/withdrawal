package kg.megacom.withdrawal.service.impl;

import kg.megacom.withdrawal.dao.NominalRepo;
import kg.megacom.withdrawal.mappers.NominalMapper;
import kg.megacom.withdrawal.models.dto.NominalDto;
import kg.megacom.withdrawal.models.entities.Nominal;
import kg.megacom.withdrawal.service.NominalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NominalServiceImpl implements NominalService {

    @Autowired
    private NominalRepo nominalRepo;

    private final NominalMapper nominalMapper;

    public NominalServiceImpl() {
        this.nominalMapper = NominalMapper.INSTANCE;
    }

    @Override
    public List<NominalDto> findAllNominalCount(int maxNominal) {
        List<Nominal> nominals = nominalRepo.findByNominalAndAmount(maxNominal);

        return nominalMapper.toEntity(nominals);
    }

    @Override
    public void refreshNominalCount(List<NominalDto> nominalDtos) {
        for (NominalDto nominalDto:nominalDtos){
            Nominal nominal = nominalRepo.findByNominal(nominalDto.getNominal());
            nominal.setAmount(nominal.getAmount()-nominalDto.getAmount());
            nominalRepo.save(nominal);
        }
    }
}
