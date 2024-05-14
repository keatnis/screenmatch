package com.keatnis.screenmatch.exception;

public class ErrorEnConversionEnDuracionException extends RuntimeException {

    private String mensage;

    public ErrorEnConversionEnDuracionException(String mensaje) {
        this.mensage = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensage;
    }
}
