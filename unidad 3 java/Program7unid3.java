/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program7unid3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Program7unid3 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int T;
      System.out.println("introduzca la temperatura :"); 
      T =sc.nextInt(); 
      if(T>=27){ 
          System.out.println("hace calor!"); 
      }else if (T>20 && T <=27){
          System.out.println("el clima es agradable");
      } else if ( T < 20){
                  System.out.println("El clima es frio");
      }
    }
}

                  
     
                  



     