/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto8;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Proyecto8 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lado: ");
        double lado = scanner.nextDouble();
        double perimetro = lado * 6;
        System.out.println(perimetro + " cm");
        scanner.close();
    }
}
