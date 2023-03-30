/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EJERCICIO3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion( ){
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
       this.numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
       this.numero2 = leer.nextInt();
    }
    
    public double sumar(Operacion op1){
        return numero1+numero2;
    }
    
    public double restar(Operacion op1){
        return numero1-numero2;
    }
    
    public double multiplicar (Operacion op1){
        if (numero1==0 || numero2==0) {
            System.out.println("Error, estas multiplicando por 0");
            return 0;
           
        }else{
            return numero1*numero2;
        }
    }
    
    public double dividir (Operacion op1){
        if (numero1==0 || numero2==0) {
            System.out.println("Error, estas dividiendo por 0");
            return 0;
           
        }else{
            return numero1/numero2;
        }
    }


    }