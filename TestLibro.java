/*
Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. 
La clase debe guardar el título del libro, autor, número de ejemplares del libro 
y número de ejemplares prestados. La clase contendrá los siguientes métodos:

* Constructor por defecto.
* Constructor con parámetros.
* Métodos Setters/getters
* Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. 
No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. 
Devuelve true si se ha podido realizar la operación y false en caso contrario.
* Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. 
No se podrán devolver libros que no se hayan prestado. 
Devuelve true si se ha podido realizar la operación y false en caso contrario.
* Método toString para mostrar los datos de los libros. 

Escribe un programa para probar el funcionamiento de la clase Libro.
 */
package Biblioteca;
import java.util.Scanner;
/**
 *
 * @author danir
 */
public class TestLibro {
    public static void main(String[]args){
        
   Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        //Creamos el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("Niebla", "Miguel de Unamuno", 5, 2);
        //Creamos el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();

        System.out.print("Introduzca titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduzca autor: ");
        autor = sc.nextLine();
        System.out.print("Número de ejemplares: ");
        ejemplares = sc.nextInt();

        //Asignamos a libro2 los datos pedidos por teclado utilizando los setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        //Mostramos los datos del objeto libro1 con sout
        //Utilizamos los getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //Probamos el préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }

        //Probamos una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }

        //Realizamos otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para ser prestados");
        }

        //Vamos a seguir prestando libros para forzar la falta de ejemplares
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        //Mostramos los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //Mostramos los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
}
}