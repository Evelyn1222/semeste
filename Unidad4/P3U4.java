package com.mycompany.P3U4;

import java.util.Scanner;


public class P3U4 {

    public static void main(String[] args) {
        
    }
        double temperaturaF = 0, temperaturaK = 0;
        int tam;

        Scanner sc = new Scanner(System.in);

         System.out.println("Ingresa las temperaturas a procesar:");
        tam = sc.nextInt();

        int[] Temperatura = new int[tam];

        for (int C = 0; C < Temperatura.length; C++) 
        {
            System.out.println("Escribe la temperatura " + C + " :");
            Temperatura[C] = sc.nextInt();

            temperaturaF = (Temperatura[C] * 9.0 / 5.0) + 32.0;
            temperaturaK = Temperatura[C] + 273.15;

            System.out.println("La temperatura en grados Celsius: " + Temperatura[C]);
            System.out.println("La temperatura en grados Fahrenheit: " + temperaturaF);
            System.out.println("La temperatura en grados Kelvin: " + temperaturaK);

    }
}