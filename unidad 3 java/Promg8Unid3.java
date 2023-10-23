/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promg8unid3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Promg8Unid3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         int num1,num2;
         System.out.println("Ingresa el primer numero: ");
         num1 = sc. nextInt();
         System.out.println("ingresa el segundo numero");
         num2 = sc. nextInt();
       
         if (num1 > num2) {
            System.out.println("El numero menor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El numero mayor es: " + num2);
        }
    }
}

        


         
         

