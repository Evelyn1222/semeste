/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progra16u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Progra16U3 {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int c=1, hora,pago , sueldo;
        while (c<=20){
         System.out.println("cantidad de horas trabajadas:");
            hora = sc.nextInt();
            System.out.println(" cantidad del pago por hora :");
            pago= sc.nextInt();
            sueldo = hora*pago;
            System.out.println(" tu sueldo es de:" + sueldo);
            c++;
        }


        }
}   


