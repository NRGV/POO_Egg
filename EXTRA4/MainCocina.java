/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EXTRA4;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class MainCocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Cocina prueba = new Cocina();
        prueba.cargarReceta();
        
        System.out.println("Ingrese la receta que desea buscar");
        String opc = read.nextLine();
        if (opc == "bizcochuelo"){
            
         
          
        }
        
        
        
    }
    
}
