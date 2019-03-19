package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double dlugoscIgly, odstepLinii;
        int iloscRzutow, przeciecieLinii=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dlugosc odstepu miedzy liniami");
        odstepLinii = Double.parseDouble(sc.nextLine());


        System.out.println("Podaj dlugosc igly:");
        dlugoscIgly = Double.parseDouble(sc.nextLine());

        while (dlugoscIgly > odstepLinii) {

            System.out.println("Dlugosc igly nie moze byc wieksza, od odstepow miedzy liniamii");
            System.out.println("Podaj ponownie dlugosc igly:");
            dlugoscIgly = Double.parseDouble((sc.nextLine()))
            ;
        }

        System.out.println("Podaj ilosc rzutow, które wykonamy:");
        iloscRzutow = Integer.parseInt(sc.nextLine());



        //Wylosowanie
        for(int i=1; i <iloscRzutow; i++){

            double srodek =Math.random()*1;
            double kat = Math.random()*90;
            double stopien = Math.toRadians(kat);
            double x = (dlugoscIgly/2)*Math.sin(stopien);

            if (srodek < x || (srodek + x) > odstepLinii){
                przeciecieLinii++;
            }

        }
        System.out.println();

        System.out.println("Na " + iloscRzutow + " wykonanych, bylo " + przeciecieLinii + " przeciec linii");
        double aproPi = (2 * iloscRzutow * dlugoscIgly)/(odstepLinii*przeciecieLinii);
        double roznicaPI= Math.PI - aproPi;

        System.out.println("Aproksymacja PI wynosi: " + aproPi );
        System.out.println(" Roznica od wartosci PI wynosi: " + roznicaPI );

    }
}
