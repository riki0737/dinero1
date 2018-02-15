package com.example.ricardolopez.dinero;

/**
 * Created by Ricardo Lopez on 15/2/2018.
 */

public class categoria {

    String tipo;
    float preu;

    public categoria(){}

    public categoria(String tp){
        this.tipo = tp;
        if(tp.equals("Pre-benajín")) this.preu = (float) 20.25;
        else if(tp.equals("Benjamín")) this.preu = (float) 23.75;
        else if(tp.equals("Alevín")) this.preu = (float) 29.50;
        else if(tp.equals("Infantil")) this.preu = (float) 39.00;
        else if(tp.equals("Cadete")) this.preu = (float) 43.50;
        else if(tp.equals("Juvenil")) this.preu = (float) 49.75;
        else if(tp.equals("4a. Catalana")) this.preu = (float) 79.25;
        else if(tp.equals("3a. Catalana")) this.preu = (float) 88.25;
        else if(tp.equals("2a. Catalana")) this.preu = (float) 23.75;
    }
    public String getTipo(){
        return tipo;
    }

    public float getPreu(){
        return preu;
    }
}
