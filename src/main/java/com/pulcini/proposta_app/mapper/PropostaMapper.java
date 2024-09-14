package com.pulcini.proposta_app.mapper;

import com.pulcini.proposta_app.dto.PropostaRequestDto;
import com.pulcini.proposta_app.entity.Proposta;
import org.mapstruct.Mapper;

@Mapper
public interface PropostaMapper {

    Proposta convertDtotoPropostaEntity(PropostaRequestDto propostaRequestDto);
}
