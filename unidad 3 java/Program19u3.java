
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program19u3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Program19u3 {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();
        
        int ceroCount = 0;
        int mayorCeroCount = 0;
        int menorCeroCount = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                ceroCount++;
            } else if (numero > 0) {
                mayorCeroCount++;
            } else {
                menorCeroCount++;
            }
        }
        
        System.out.println("Cantidad de ceros: " + ceroCount);
        System.out.println("Cantidad de números mayores a cero: " + mayorCeroCount);
        System.out.println("Cantidad de números menores a cero: " + menorCeroCount);
        
        scanner.close();
    }
}
