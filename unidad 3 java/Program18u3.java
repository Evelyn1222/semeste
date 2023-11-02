/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program18u3;

/**
 *
 * @author LaboratorioLTI2
 */
public class Program18u3 {

    public static void main(String[] args) {
        double salario = 1500, incremento = 1.1;
        double sueldoAnual;
        double c=1, suma=0;
        
        while ( c<=6)
        {
            salario = salario*incremento;
        System.out.println("tu salario mensual es del año" + c +" es:" + salario);
           sueldoAnual = salario * 12;
          System.out.println("tu salario mensual es del año" + c +" es:" + sueldoAnual);
          suma = suma + sueldoAnual;
          c++;
                  }
        System.out.println("tu sueldo acomulado de 6 años es:" + suma);
          
           
           
        
            
    }
}
