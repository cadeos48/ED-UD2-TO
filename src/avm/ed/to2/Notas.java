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
public class Notas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);        
        float []notas = new float[6];
        float notaMax = 0;//Le asigno el valor cero porque es la menor nota posible
        // por lo que al realizar la comparación con las notas del array, el primer valor
        //de notaMax (0), siempre será menor que la primera nota almacenada asignándose
        //en el bucle el valor de la primera nota a la variable notaMax y realizando
        //el resto de comparaciones con los valores del array
        float notaMin = 10;//Le asigno el valor diez porque es la mayor nota posible
        // por lo que al realizar la comparación con las notas del array, el primer valor
        //de notaMin (10), siempre será mayor que la primera nota almacenada, asignándose
        //en el bucle el valor de la primera nota a la variable notaMin y realizando
        //el resto de comparaciones con los valores del array
        float sumatoria = 0;
        int numAprobados = 0;
        int numSuspensos = 0;
        
        System.out.println("Introduzca las notas  de los seis alumnos");
        for(int cont = 0; cont < 6 ; cont++){
            System.out.println("Introduzca nota alumno "+ (cont+1));
            notas[cont]= ES.leerDecimal();
            if (notaMax < notas[cont]) notaMax = notas[cont];
            if (notaMin > notas[cont]) notaMin = notas[cont];
            }        
             
        for (int cont = 0; cont <6; cont++){
            sumatoria = sumatoria + notas[cont];
            if (notas[cont] > 5) numAprobados++;
            else numSuspensos++;                    
        }

        
        System.out.println("Las notas introducidas son: ");
        for (int cont = 0; cont < 6; cont++){
            System.out.println("Alumno" +cont + " " +notas[cont] + " ");            
        }
        
        System.out.println();
        System.out.println("La nota máxima es: " + notaMax);
        System.out.println("La nota mínima es: " + notaMin);
        System.out.println("El promedio es: " + sumatoria/6);
        System.out.println("El numero de aprobados es: " + numAprobados);
        System.out.println("El numero de suspensos es: " + numSuspensos);
    }
}
        

