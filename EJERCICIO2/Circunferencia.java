/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EJERCICIO2;

import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
 * A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * @author Rodrigo
 */
public class Circunferencia {

  private Double radio;
  

    public Circunferencia() {
    }
   
    public Circunferencia(Double radio) {
        this.radio = radio;
      
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio=leer.nextDouble();
    }
    
    public void MetodoArea(){
        double area;
        area = Math.PI * Math.pow(radio,2) ;
        area = Math.round((area)*1000.0d)/1000.0d;
        System.out.println("El area es: "+area);

    }
    public void MetodoPerimetro(){
        double perimetro;
    perimetro = 2 * Math.PI * radio ;
    perimetro = Math.round((perimetro)*1000.0d)/1000.0d;
        System.out.println("El perimetro es: "+perimetro);

}
}

