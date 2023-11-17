/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program13u4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Program13U4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
   
        
        float [][] temp = new float [5][7];
        
        for ( int f= 0; f<5; f++){
            for ( int c=0; c<7 ; c++){
                System.out.println("escribe temperatura  en (" +f+","+c+")");
                temp[f][c] = sc.nextFloat();
            }
        }
         float [][] temF= new float [5][7];
          for ( int f= 0; f<5; f++){
            for ( int c=0; c<7 ; c++){
                     temF [f][c]= (temp[f][c]*9/5) + 32;
                      System.out.print("f°en (" +f+","+c+","+temF[f][c]+")");

            }
            System.out.println();
    }
    }
    
}


