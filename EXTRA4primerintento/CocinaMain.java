/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EXTRA4primerintento;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class CocinaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Cocina prueba = new Cocina();
        String nombre;
        String op;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Desea agregar una receta? s/n");
            op = leer.next();
            if (op.equalsIgnoreCase("s")) {                
                libroderecetas();
            }
        } while (op.equalsIgnoreCase("s"));
        
    }
        
        
        
    }
    
}
