/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Programa3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double p1, p2, p3, subtotal, total, ivaT; 
        final double iva = 0.16; 
        System.out.println("ingrese el valor del primer producto");
        p1 = sc.nextDouble();
        System.out.println("ingrese el valor del segundo producto");
        p2 = sc.nextDouble();
        System.out.println("ingrese el valor del tercer producto");
        p3 = sc.nextDouble();
        total = p1+p2+p3;
        ivaT = total*iva;
        subtotal = total-ivaT; 
        System.out.println("el valor total es:" + total);
        System.out.println("el iva total es:" + ivaT);
        System.out.println("el valor Subtotal es:" + subtotal); 
         
    }
}
 
 
