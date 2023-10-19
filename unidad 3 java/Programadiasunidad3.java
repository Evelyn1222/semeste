/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programadiasunidad3;
import java.util.Scanner; 
/**
 *
 * @author Usuario
 */
public class Programadiasunidad3 {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int Dias;
      System.out.println("escribe el numero de la semana:"); 
      Dias =sc.nextInt();
      switch (Dias){ 
              case 1:
                  System.out.println(" lunes"); 
                  break; 
              case 2:
              
              System.out.println("martes"); 
               break;
               
              case 3: 
                  System.out.println("miercoles");
                  break;
                  
              case 4: 
                  System.out.println("jueves");
                  break; 
                  
              case 5: 
                  System.out.println(" viernes ");
                 
                  break;  
                  
                  
              case 6: 
                  System.out.println("sabado");
                  break;
                  
              case 7: 
                  System.out.println(" domingo ");
                  break; 
           
              default: 
                  System.out.println("no existe el dia ingresado:" );
      }
    }
}      
      
                  

   