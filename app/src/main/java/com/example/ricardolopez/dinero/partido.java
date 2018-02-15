package com.example.ricardolopez.dinero;

/**
 * Created by Ricardo Lopez on 15/2/2018.
 */

public class partido {

    categoria tipo;
    String temporada;
    int mes;
    int dia;

    public partido(){}

    public partido(String t, String temp, int m, int d){
        this.tipo = new categoria(t);
        this.temporada = temp;
        this.mes = m;
        this .dia = d;
    }

    public categoria getcategoria(){
        return tipo;
    }

    public String getTemporada(){
        return temporada;
    }

    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }
}
