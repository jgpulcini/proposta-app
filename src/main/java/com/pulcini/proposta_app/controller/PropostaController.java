package com.pulcini.proposta_app.controller;

import com.pulcini.proposta_app.dto.PropostaRequestDto;
import com.pulcini.proposta_app.dto.PropostaResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PropostaController {

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto requestDto) {
        return null;
    }
}
