/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EJERCICIO3;

/**
 *
 * @author Rodrigo
 */
public class MainOperacion {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Operacion op1 =  new Operacion();
        
       op1.crearOperacion();
       
        System.out.println("La suma es "+op1.sumar(op1));
        System.out.println("La resta es "+op1.restar(op1));
        System.out.println("La multiplicacion es "+op1.multiplicar(op1));
        System.out.println("La division es "+op1.dividir(op1));
       
        
    }
}