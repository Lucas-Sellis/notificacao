package com.lucassellis.notificacao.infrastructure.client;


import com.lucassellis.notificacao.api.dto.ComunicacaoInDTO;
import com.lucassellis.notificacao.api.dto.ComunicacaoOutDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "comunicacao", url = "${comunicacao.url}")
public interface ComunicacaoClient {

    @PostMapping("/comunicacao/agendar")
    ComunicacaoOutDTO agendar(@RequestBody ComunicacaoInDTO dto);

    @GetMapping("/comunicacao")
    ComunicacaoOutDTO buscarStatus(@RequestParam String emailDestinatario);

    @PatchMapping("/comunicacao/cancelar")
    ComunicacaoOutDTO cancelarStatus(@RequestParam String emailDestinatario);
}



