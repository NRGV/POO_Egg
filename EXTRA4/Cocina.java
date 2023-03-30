/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EXTRA4;

/**
 *
 * @author Rodrigo
 */
public class Cocina {
    public Cocina() {
    }
    
    Receta nom = new Receta();
    public String[] recetas = new String[3];
    
    public void cargarReceta(){
        nom.cargarRecetas();
        for (int i = 0; i < 3; i++) {
            recetas[0] = nom.nombre1;
            recetas[1] = nom.nombre2;
            recetas[2] = nom.nombre3;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(recetas[i]);
        }
    }
}
