/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program5unid3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Program5unid3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = 0;

        System.out.println("Ingrese  un número: ");
        numero = sc.nextInt();

        if ((numero % 2) == 0){
            System.out.println(numero + " es par");
        }else{
            System.out.println(numero + " es impar");
        }
     }
}
    

