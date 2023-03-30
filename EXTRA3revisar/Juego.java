/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EXTRA3revisar;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Juego {
    private int num;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void Iniciar_Juego(){
        Scanner read = new Scanner(System.in);
        System.out.println("Juegodar 1: Ingrese el numero secreto");
        this.num = read.nextInt();
        System.out.println("Juegador 2: intente adivinar el numero");
        int num2 = read.nextInt();
        int intentos = 1;
        
        if (num == num2 && ) {
            
            System.out.println("Acertaste!! el numero oculto era " + num);
            
        }
        
        do {
            intentos++;
            System.out.println("Error, intento numero " + intentos);
            
        }
        
        while (num != num2 && intento<5);
    }
    
}


//    public void iniciar_juego() {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Jugador 1 : Ingrese el numero oculto");
//        this.num = leer.nextInt();
//        System.out.println("Jugador 2 : Adivine el numero oculto, recorda que solo tenes 5 intentos");
//        int num2 = leer.nextInt();
//        int intentos = 1;
//
//        if (num == num2) {
//            System.out.println("Acertaste, el numero oculto era " + num);
//        } else {
//            while (num != num2 && intentos < 5) {
//                
//                System.out.println("Jugador 2 : Error, intente de nuevo");
//                num2 = leer.nextInt();
//                if (num == num2) {
//                    System.out.println("Acertaste, el numero oculto era " + num); 
//                    
//                }
//                intentos++;
//            }
//            if (intentos>5) {
//                System.out.println("Agotaste tus 5 intentos");
//                
//            }
//
//        }
//
//    }


//public void iniciar_juego() {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Jugador 1 : Ingrese el numero oculto");
//        this.num = leer.nextInt();
//        System.out.println("Jugador 2 : Adivine el numero oculto, recorda que solo tenes 5 intentos");
//        int num2 = leer.nextInt();
//        int intentos = 1;
//        int prueba =3;
//
//        if (num == num2) {
//            System.out.println("Acertaste, el numero oculto era " + num);
//        } else {
//            while (num != num2 && intentos <= 5) {
//
//                System.out.println("Jugador 2 : Error, intente de nuevo");
//                num2 = leer.nextInt();
//                if (num == num2) {
//                    System.out.println("Acertaste, el numero oculto era " + num);
//
//                }
//                System.out.println("Intentos restantes" +prueba--);
//               intentos++;
//
//            }
//
//           
//        }