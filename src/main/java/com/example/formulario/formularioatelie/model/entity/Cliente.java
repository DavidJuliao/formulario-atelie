package com.example.formulario.formularioatelie.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_cli")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idCliente;

    @Column(name = "nom")
    private String nome;

    @Column(name = "ema")
    private String email;

    @Column(name = "tel")
    private String telefone;

    @Column(name = "men")
    private String mensagem;

    @Column(name = "tip_con")
    private String tipoContato;

    @Column(name = "hor_ate")
    private String horarioAtendimento;

    public Long getId() {
        return idCliente;
    }

    public void setId(Long id) {
        this.idCliente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", tipoContato=" + tipoContato +
                ", horarioAtendimento=" + horarioAtendimento +
                '}';
    }
}
