package com.lucassellis.notificacao.api;


import com.lucassellis.notificacao.api.dto.ComunicacaoInDTO;
import com.lucassellis.notificacao.api.dto.ComunicacaoOutDTO;
import com.lucassellis.notificacao.business.ComunicacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comunicacao")
public class ComunicacaoController {


    private final ComunicacaoService service;

    public ComunicacaoController(ComunicacaoService service) {
        this.service = service;
    }


    @PostMapping("/agendar")
    public ResponseEntity<ComunicacaoOutDTO> agendar(@RequestBody ComunicacaoInDTO dto)  {
        return ResponseEntity.ok(service.agendarComunicacao(dto));
    }

    @GetMapping()

    public ResponseEntity<ComunicacaoOutDTO> buscarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.buscarStatusComunicacao(emailDestinatario));
    }

    @PatchMapping("/cancelar")

    public ResponseEntity<ComunicacaoOutDTO> cancelarStatus(@RequestParam String emailDestinatario) {

        return ResponseEntity.ok(service.alterarStatusComunicacao(emailDestinatario));
    }


}
