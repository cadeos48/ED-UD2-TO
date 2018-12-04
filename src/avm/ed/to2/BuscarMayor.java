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
public class BuscarMayor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dominio = 0;
        int numMax = 0;
            
        //He confeccionado el programa para que pida por teclado la dimensión del array,
        //como prueba, en Pseint lo hice con una dimensión fija, que es una solución más
        //sencilla
        do {
            System.out.println("Introduzcala cantidad de números que quiere comparar");
            dominio = ES.leerEntero();            
            if (dominio <= 0) System.out.println("Introduzca un número mayor que cero");
        }
        while(dominio <=0);
        int [] numeros = new int[dominio];
        
        for(int cont = 0; cont < dominio ; cont++){
            System.out.println("Introduzca número "+ (cont+1));
            numeros[cont]= ES.leerEntero();
            if (numMax < numeros[cont])numMax = numeros[cont];
        }
            
        System.out.print("Los números introducidos son: ");
        for (int cont = 0; cont <dominio; cont++){
            System.out.print(numeros[cont] + " ");
        }
        
        System.out.println();
        System.out.println("El número máximo es: " +numMax);
    }
}