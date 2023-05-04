package pilas.Libros;
import java.util.Scanner;
public class PilaDeLibros {

    private int max;
    private int tope;
    private Libro[] libros;

    public PilaDeLibros() {
        this.max = 10;
        this.tope = 0;
        this.libros = new Libro[this.max + 1];
    }

    public boolean esVacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return tope;
    }

    public void adicionar(Libro nuevoLibro) {

        if (esLlena()) {
            System.out.println("PILA DE LIBROS LLENA");
        } else {
            tope = tope + 1;
            libros[tope] = nuevoLibro;
        }

    }

    public Libro eliminar() {
        Libro libroEliminado = null;
        if (esVacio()) {
            System.out.println("PILA DE LIBROS VACIA");
        } else {
            libroEliminado = libros[this.tope];
            tope = tope - 1;
        }
        return libroEliminado;
    }

    public void vaciar(PilaDeLibros pila) {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        Libro libro = null;
        if (esVacio()) {
            System.out.println("No hay libros que mostrar");
        } else {

            System.out.println("\n Mostrando la PILA DE LIBROS");
            PilaDeLibros aux = new PilaDeLibros();
            while (!esVacio()) {
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarLibro();
            }
            vaciar(aux);
        }
    }
}

