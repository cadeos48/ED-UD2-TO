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
public class CuentaAtras {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);        
        int numero;
        
        System.out.println("Introduzca un número");
        numero = ES.leerEntero();
        for(int cont = numero; cont >= 0; cont--) {
            System.out.print(cont + " ");
        }
    }
}
