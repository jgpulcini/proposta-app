package com.pulcini.proposta_app.service;

import com.pulcini.proposta_app.dto.PropostaRequestDto;
import com.pulcini.proposta_app.dto.PropostaResponseDto;
import com.pulcini.proposta_app.mapper.PropostaMapper;
import com.pulcini.proposta_app.mapper.PropostaMapperImpl;
import com.pulcini.proposta_app.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

//    @Autowired
//    private PropostaMapper propostaMapper;

    public PropostaResponseDto criar(PropostaRequestDto requestDto) {
        PropostaMapperImpl propostaMapper = new PropostaMapperImpl();
        propostaRepository.save(propostaMapper.convertDtotoPropostaEntity(requestDto));
        return null;
    }


}
