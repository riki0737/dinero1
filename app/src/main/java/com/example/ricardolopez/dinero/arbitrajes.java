package com.example.ricardolopez.dinero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo Lopez on 15/2/2018.
 */

public class arbitrajes {


    private List<partido> parts = new ArrayList<partido>();
    private partido p;

    private int buscar_partido(String nom, String temporada, int mes, int dia){
        for(int i = 0; i < parts.size(); ++i){
            p = parts.get(i);
            if(p.getTemporada().equals(nom)){
                if(p.getcategoria().getTipo().equals(nom)){
                    if(p.getMes() == mes && p.getDia() == dia) return i;
                }
            }
        }
        return -1;
    }

    public arbitrajes(){}

    public void añadirpartido(String nom, String temporada, int mes, int dia){
        p = new partido(nom,temporada,mes,dia);
        parts.add(p);
    }

    public void eliminarpartido(String nom, String temporada, int mes, int dia){
        int i = buscar_partido(nom,temporada,mes,dia);
        if(i != -1) parts.remove(i);
    }

    public List mostrarpartidos(){
        return parts;
    }
}
