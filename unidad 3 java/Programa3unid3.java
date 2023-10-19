/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3unid3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa3unid3 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int meses;
      System.out.println("escribe el numero del mes:"); 
      meses =sc.nextInt();
      switch (meses){ 
              case 1:
                  System.out.println(" enero"); 
                  break; 
              case 2:
              
              System.out.println(" febrero"); 
               break;
               
              case 3: 
                  System.out.println(" marzo");
                  break;
                  
              case 4: 
                  System.out.println("abril");
                  break; 
                  
              case 5: 
                  System.out.println(" mayo ");
                 
                  break;  
                  
                  
              case 6: 
                  System.out.println(" junio");
                  break;
                  
              case 7: 
                  System.out.println(" julio ");
                  break; 
           
                  
              case 8:
                  System.out.println(" agosto"); 
                  break; 
              case 9:
              
              System.out.println(" septiembre"); 
               break;
               
              case 10: 
                  System.out.println(" octubre");
                  break;
                  
              case 11: 
                  System.out.println("noviembre");
                  break; 
                  
              case 12: 
                  System.out.println(" diciembre");
                 
                  break;  
                  
                  
              default: 
                  System.out.println("no existe el dia ingresado:" );
                  
      }
      
                  
                  
           
            
              
              
               
               
              
         
         
      
              
              
    }
}
