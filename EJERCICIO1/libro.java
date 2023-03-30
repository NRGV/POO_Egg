/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA7.EJERCICIO1;

import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas,
 * y un constructor con todos los atributos pasados por parámetro 
 * y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
 * y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Rodrigo
 */
public class libro {
    public String ISBN;
    public String Titulo;
    public String autor;
    public int numPage;
    public boolean publish;
    public int yearofpublish;

    public libro(String ISBN, String Titulo, String autor, int numPage, boolean publish, int yearofpublish) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.numPage = numPage;
        this.publish = publish;
        this.yearofpublish = yearofpublish;
    }
  
    public libro() {
    }
   
    public void subirLibro() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = read.next();

        System.out.println("Ingrese el titulo del libro");
        this.Titulo = read.next();

        System.out.println("Ingrese el autor del libro");
        this.autor = read.next();

        System.out.println("Ingrese el numero de paginas del libro");
        this.numPage = read.nextInt();

        System.out.println("Si el libro ya fue publicado ingrese true. Si el libro no fue publicado aun, ingrese false");
        String letra = read.next();
        if (letra.equalsIgnoreCase("y")) {
            publish = true;
            System.out.println("Ingrese el año de la publicacion");
            this.yearofpublish = read.nextInt();
        }

    
    }
    public void mostrarLibro() {
        if (this.publish == false) {
            System.out.println("El libro " + this.Titulo + " del autor " + this.autor + " aun no fue publicado");
        } else {
            System.out.println("El libro " + this.Titulo + " del autor " + this.autor + " fue publicado el año " + this.yearofpublish);
        }
    }
}
