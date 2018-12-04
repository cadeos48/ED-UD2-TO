/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.ed.to2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class operacionesTresNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int [] num = new int[3];
        int producto, suma;
        
        for(int cont = 0; cont < 3; cont++){
            System.out.println("Introduzca un número");
            num[cont]= ES.leerEntero();
        }
        
        if (num[0] < 0) {
            producto = num[0]*num[1]*num[2];
            System.out.println ("El producto es: " +producto);
        } else {
            suma = num[0]+num[1]+num[2];
            System.out.println("La suma es: " +suma);
        }
      }    
}
