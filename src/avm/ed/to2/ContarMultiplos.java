/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.ed.to2;

/**
 *
 * @author Usuario
 */
public class ContarMultiplos {
    public static void main(String[] args){
        int contaDivDos = 0;
        int contaDivTres = 0;
        
        for (int cont = 1; cont <= 100; cont++){
            if (cont%2 == 0) contaDivDos++;
            if (cont%3 == 0) contaDivTres++;
        }
        System.out.println("El total de números divisibles entre dos es: " +contaDivDos);
        System.out.println("El total de números divisibles entre tres es: " +contaDivTres);
    }
}
