package com.lucassellis.notificacao.business;

import com.lucassellis.notificacao.api.dto.ComunicacaoInDTO;
import com.lucassellis.notificacao.api.dto.ComunicacaoOutDTO;
import com.lucassellis.notificacao.infrastructure.client.ComunicacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComunicacaoService {

    private final ComunicacaoClient client;

    public ComunicacaoOutDTO agendarComunicacao(ComunicacaoInDTO dto) {
        // Removido o tipo "ComunicacaoInDTO" de dentro do parêntese
        return client.agendar(dto);
    }

    public ComunicacaoOutDTO buscarStatusComunicacao(String emailDestinatario) {
        return client.buscarStatus(emailDestinatario);
    }

    public ComunicacaoOutDTO alterarStatusComunicacao(String emailDestinatario) {
        // Removido o tipo "String" de dentro do parêntese
        return client.cancelarStatus(emailDestinatario);
    }
}