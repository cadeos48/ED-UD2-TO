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
public class ES {

    /**
     * @param args the command line arguments
     */
     public static char leerChar(){
        char dimeChar;     
        Scanner teclado = new Scanner(System.in);
        dimeChar = teclado.next().charAt(0);
        return dimeChar;
     }
     
    public static int leerEntero() {
        int entero = 0;
        boolean comprobacion = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                entero = teclado.nextInt();
                comprobacion = true;
                } catch (Exception e) {
                    System.out.println("Dato erróneo. Introduzca un número");
                    teclado.nextLine();
                }
        }
        while (comprobacion == false);
        return entero;
    }
    
    public static float leerDecimal(){
        float numDec = 0;
        Scanner teclado = new Scanner(System.in);
        boolean validacion = false;        
        do{
           try {               
               numDec = teclado.nextFloat();
               validacion = true;
           }
           catch(Exception e){
               System.out.println("Valor no válido, introduzca un número");
               teclado.nextLine();
           }
        }
        while(validacion == false);
        return numDec;
    }
    
    public static String leerCadena(){
        String dimeCadena;     
        Scanner teclado = new Scanner(System.in);
        dimeCadena = teclado.next();
        return dimeCadena;
    }
     
}