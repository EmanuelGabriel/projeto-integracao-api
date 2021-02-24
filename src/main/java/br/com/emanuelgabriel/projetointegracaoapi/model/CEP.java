package br.com.emanuelgabriel.projetointegracaoapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CEP implements Serializable {

    private String bairro;

    private String cidade;

    @JsonProperty(value = "estado_info")
    private Estado estadoInfo;

    private String cep;

    @JsonProperty(value = "cidade_info")
    private Cidade cidadeInfo;

    private String estado;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstadoInfo() {
        return estadoInfo;
    }

    public void setEstadoInfo(Estado estadoInfo) {
        this.estadoInfo = estadoInfo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidadeInfo() {
        return cidadeInfo;
    }

    public void setCidadeInfo(Cidade cidadeInfo) {
        this.cidadeInfo = cidadeInfo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CEP{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estadoInfo=" + estadoInfo +
                ", cep='" + cep + '\'' +
                ", cidadeInfo=" + cidadeInfo +
                ", estado='" + estado + '\'' +
                '}';
    }
}


