package com.company;

public class Menu {
    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = "";
        while(seguirPidiendo) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
        }
    }
}
