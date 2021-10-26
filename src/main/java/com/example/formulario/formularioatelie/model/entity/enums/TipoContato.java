package com.example.formulario.formularioatelie.model.entity.enums;

public enum TipoContato {
    EMAIL("Email"), WHATSAPP("WhatsApp"), TELEFONE("Telefone");

    private String tipoContato;

    TipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    TipoContato() {

    }

    public String getTipoContato() {
        return tipoContato;
    }

}
