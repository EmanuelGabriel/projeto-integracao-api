package br.com.emanuelgabriel.projetointegracaoapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cidade {

    @JsonProperty(value = "area_km2")
    private String areaKm2;

    @JsonProperty(value = "codigo_ibge")
    private String codigoIbge;


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

    @Override
    public String toString() {
        return "Cidade{" +
                "areaKm2='" + areaKm2 + '\'' +
                ", codigoIbge='" + codigoIbge + '\'' +
                '}';
    }
}
