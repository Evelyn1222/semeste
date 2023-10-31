
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program18u3;

/**
 *
 * @author Usuario
 */
public class Program18u3 {

    public static void main(String[] args) {
        double salarioInicial = 1500;
        double aumentoAnual = 0.10;
        int años = 6;
        int añoActual = 1;

        while (añoActual <= años) {
            salarioInicial += salarioInicial * aumentoAnual;
            System.out.println("Año " + añoActual + ": $" + salarioInicial);
            añoActual++;
        }

        System.out.println("El salario después de " + años + " años es: $" + salarioInicial);
    }
}
