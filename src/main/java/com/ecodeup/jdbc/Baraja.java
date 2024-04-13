package com.ecodeup.jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        //crear lista
        cartas=new ArrayList<>();
        //crear cartas
        String[] contenidos ={"carta1","carta2","carta3","carta4","carta5","carta6","carta7","carta8","carta9","carta10","carta11","carta12",};
        for (String contenido :contenidos){
            cartas.add(new Carta(contenido));
        }
    }
    public void mezclar(){
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()){
            System.out.println("la baraja esta vacia");
            return null;
        }
        return cartas.remove(0);
    }
    public void guardarCarta(Carta carta){
        cartas.add(carta);
    }
}
