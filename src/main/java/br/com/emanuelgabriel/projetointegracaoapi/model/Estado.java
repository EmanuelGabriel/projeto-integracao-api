package br.com.emanuelgabriel.projetointegracaoapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Estado implements Serializable {

    @JsonProperty(value = "area_km2")
    private String areaKm2;

    @JsonProperty(value = "codigo_ibge")
    private String codigoIbge;

    private String nome;

    public String getAreaKm2() {
        return areaKm2;
    }

    public void setAreaKm2(String areaKm2) {
        this.areaKm2 = areaKm2;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "areaKm2='" + areaKm2 + '\'' +
                ", codigoIbge='" + codigoIbge + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
