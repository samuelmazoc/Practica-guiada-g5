package org.example;

import org.example.AYUDAS.LICOR;
import org.example.MODELOS.CLIENTE;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LICOR licorUno = new LICOR();
        LICOR licorDos = new LICOR("RON", 80000, LocalDate.of(2028,10,31), 29.0, LocalDate.of(2000,9,11));

        CLIENTE Cliente1 = new CLIENTE();
        CLIENTE Cliente2 = new CLIENTE("jose", 1026131090, 2000000, "RON", "AMIGO");


        //accediendo a los atributos

        System.out.println(licorUno.getTIPO());
        System.out.println(licorDos.getTIPO());

    }
}