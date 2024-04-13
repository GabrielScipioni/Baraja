package com.ecodeup.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Baraja bar=new Baraja();
        bar.mezclar();

        while (true){
            System.out.println("precione enter para sacar carta o ingrese 'Salir' para terminar");
            String input=scan.nextLine();
            if (input.equalsIgnoreCase("salir")){
                break;
            }
            Carta carta= bar.sacarCarta();
            if (carta != null){
                System.out.println("sacaste la carta: "+ carta.getContenido());
                bar.guardarCarta(carta);
            }
        }
        System.out.println("chau");
        scan.close();
    }
}