/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program17u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Program17U3 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char opcion;
      do{
        System.out.println("bienvenido a una sola ejecucion");
        System.out.println("escribe n para salir:");
        opcion = sc.next().charAt(0);
        System.out.println(opcion);

      }while(opcion!= 'n');
    }
}
