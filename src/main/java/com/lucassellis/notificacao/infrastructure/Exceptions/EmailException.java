package com.lucassellis.notificacao.infrastructure.Exceptions;

public class EmailException extends RuntimeException {

    public EmailException(String message) {
        super(message);
    }


    public EmailException(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }
}
