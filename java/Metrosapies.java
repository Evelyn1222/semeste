/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metrosapies;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Metrosapies {

    public static void main(String[] args) {
              
                Scanner M = new Scanner(System.in);
		double f;
		
		System.out.println("Ingresa el valor de los metros: ");
		double metros = M.nextDouble();
		f = metros  * 3.281;
		System.out.println(metros  +" m son iguales a: "+ f +" ft ");
        }
}

 
 