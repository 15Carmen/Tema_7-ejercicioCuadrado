package com.company;

public class Cuadrado {

    int lado;

    public Cuadrado (int lado){
        this.lado=lado;
    }

    public String toString (){
        String resultado = "";
        for (int i = 0; i<lado; i++){
            for (int j=0; j<lado; j++){
                resultado="*" + resultado;
            }
           resultado= resultado + "*";
        }

        for (int j=1; j<lado-1; j++){
            resultado = resultado+ "+\n";
        }

        return resultado;
    }
}
