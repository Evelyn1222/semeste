/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program24u3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Program24u3 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("ingrese un número negativo para detenerse: ");
            n = scanner.nextInt();

            if (n <=0) {
                System.out.println(" el Programa fue detenido :)");
                break;
            }

            if (n % 2 == 0) {
                System.out.println(n + " es  par.");
            } else {
                System.out.println(n + " es  impar.");
            }
        }

        scanner.close();
    }
}

        
