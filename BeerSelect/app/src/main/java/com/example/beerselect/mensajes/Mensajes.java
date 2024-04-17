package com.example.beerselect.mensajes;

import java.util.ArrayList;
import java.util.List;

public class Mensajes {
    public static List<String> getAllCantidadCervezas(String cuantas) {
        List<String> cantidad = new ArrayList<>();

        if (cuantas.equals("Una")) {
            cantidad.add(" 1 Sola?");
        } else if (cuantas.equals("Dos")) {
            cantidad.add(" Aja andas acompañado!");
        } else if (cuantas.equals("Tres")) {
            cantidad.add(" Tu y 2 panas!!!");
        } else if (cuantas.equals("Cuatro")) {
            cantidad.add(" 2 pa 2!!!!");
        } else if (cuantas.equals("Cinco")) {
            cantidad.add(" 5????");
            cantidad.add(" Para eso llevate el SixPack");
        } else if (cuantas.equals("Seis")) {
            cantidad.add(" DISFRUTA");
            cantidad.add(" No vayas a conducir!");
        }
        return cantidad;
    }
}
