package pilas.Libros;

public class Libro {

    private String autor;
    private int nroPag;
    private double precio;
    private String titulo;
    private String categoria;

    public Libro(String autor, int nroPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarLibro(){
        System.out.println("\n Mostrando libro");
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Numero de paginas: "+ this.getNroPag());
        System.out.println("Precio: "+ this.getPrecio());
        System.out.println("Titulo del Libro: "+ this.getTitulo());
        System.out.println("Categoria: "+ this.getCategoria());
    }
}
