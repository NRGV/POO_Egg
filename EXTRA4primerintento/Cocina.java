/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EXTRA4primerintento;

/**
 *
 * @author Rodrigo
 * 
 * Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
 * Luego, crea métodos para agregar nuevas recetas a la lista, 
 * para buscar una receta por nombre y para obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina.
 * 
 * 
 */
public class Cocina {
public String recetas1;
public String recetas2;

    public Cocina() {
    }

    public Cocina(String recetas1, String recetas2) {
        this.recetas1 = recetas1;
        this.recetas2 = recetas2;
    }

   
   
    public void libroderecetas(){
          String [][] lista1 = new String[4][4];
    
   String B = bizcochuelo();
    
     for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                lista1[0][0] = B;
                lista1[0][1] = 
                
            }
        }
        
        
    }
    
    public String[] bizcochuelo(){
        
       String [] bizcochuelo = new String[3];
       
       for (int i = 0 ; i < bizcochuelo.length ; i++){
           bizcochuelo[0] = "leche";
           bizcochuelo[1] = "harina";
           bizcochuelo[2] = "huevos";
           
           
       }
    return bizcochuelo;
       
    }
    
    public void recetas(){
    
}
