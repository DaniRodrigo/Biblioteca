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

/**
 *
 * @author danir
 */
public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //constructor vacio
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //getters y setters de parámetros
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método para préstamo de libros
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para devolución de libros
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
   
}