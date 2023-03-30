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
public class Receta {
    //RECETA (ATRIBUTO NOMBRE DE RECETA, ARREGLO CON INGREDIENTE  CON METODOS


    public String nombre1;
    public String nombre2;
    public String nombre3;
    public String[] ingredientes1 = new String[10];
    public String[] ingredientes2 = new String[10];
    public String[] ingredientes3 = new String[10];

    public Receta() {
    }

    public Receta(String nombre1, String nombre2, String nombre3) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String[] getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(String[] ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public String[] getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(String[] ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public String[] getIngredientes3() {
        return ingredientes3;
    }

    public void setIngredientes3(String[] ingredientes3) {
        this.ingredientes3 = ingredientes3;
    }
    
    public void cargarRecetas(){
        nombre1 = "Bizcochuelo";
        nombre2 = "Cafe con leche";
        nombre3 = "Fideos con tuco";
      
      
    }
    

    
     public String[] bizcochuelo(){
        
       String [] bizcochuelo = new String[3];
       
        for (String bizcochuelo1 : bizcochuelo) {
            bizcochuelo[0] = "leche";
            bizcochuelo[1] = "harina";
            bizcochuelo[2] = "huevos";
        }
    return bizcochuelo;
       
    }
    
    
    
    
    
}
