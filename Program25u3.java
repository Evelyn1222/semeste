/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program25u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Program25u3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1, numero2, resultado;
        char opcion;

        while (true) {
            System.out.print("Ingresa el primer número: ");
            String inputStr = input.next();
            
            System.out.print("Ingresa el segundo número: ");
            numero2 = input.nextDouble();
            
              numero1 = Double.parseDouble(inputStr);

            System.out.print("Ingresa un operador (+, -, *, /):( presione 'q' para salir del programa) ");
            opcion = input.next().charAt(0);

            switch (opcion) {
                case '+':
                    resultado = numero1 + numero2;
                    System.out.println("Resultado es: " + resultado);
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    System.out.println("Resultado es: " + resultado);
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    System.out.println("Resultado es: " + resultado);
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado es: " + resultado);
                        
                    }
                 
                   
     
            }
            
        }
        
    }
}

       

