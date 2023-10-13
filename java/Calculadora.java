/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadora {

    public static void main(String[] args) {
		float Suma, Resta, Multiplicacion, Division;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		float Numero1 = sc.nextFloat();
		System.out.println("Ingresa el segundo numero: ");
		float Numero2 = sc.nextFloat();
		Suma = Numero1 + Numero2;
		Resta = Numero1 - Numero2;
		Multiplicacion = Numero1 * Numero2;
		Division = Numero1 / Numero2;
		System.out.println("La suma de los numeros es: "+Suma);
		System.out.println("La resta de los numeros es: "+Resta);
		System.out.println("La multiplicación de los numeros es: "+Multiplicacion);
		System.out.println("La divición de los numeros es: "+Division);
		
	} 
}

