/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program12u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Program12U3 {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int c,t,numero; 
        System.out.println("escribe los numero que se va a procesar:");
        t = sc.nextInt();
        for (c=1; c<=t; c++){
            System.out.println("escribe numero:");
            numero= sc.nextInt();
            if (numero%2 == 0)
                 System.out.println(" es par");
            else
                System.out.println("es impar");
        }
        
    }
}
