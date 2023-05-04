package pilas.Libros;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1A = new Libro("Homero",500,90.00,"La odisea","Historia");
        Libro libro2A = new Libro("Bowden",200,20.00,"Brotherhood","Fantasia");


        PilaDeLibros pila1 = new PilaDeLibros();

        pila1.adicionar(libro1A);
        pila1.adicionar(libro2A);

        Libro libro1B = new Libro("Homero",500,80.00,"La odisea","Historia");
        Libro libro2B = new Libro("Bowden",200,10.00,"Brotherhood","Fantasia");

        PilaDeLibros pila2 = new PilaDeLibros();

        pila2.adicionar(libro1B);
        pila2.adicionar(libro2B);

        pila1.mostrar();
        pila2.mostrar();

        // ejercicio 1: determinar cuantos libros tienen un costo mayor a Bs 25
        // crear metodo statico dentro de la clase main
        //determianrPrecios25s(pila1, 25);

        // ejercicio 2: a todos los libros de historia agregarles un 10% de descuento de precio
       // agregardescuento(pila1, 10);


        // ejercicio 3: a todos los libros de historia agregarles un 10% de descuento de precio
        intercambiandoMaximos(pila1, pila2);
    }
    public static void intercambiandoMaximos(PilaDeLibros pila1, PilaDeLibros pila2)
    {
        PilaDeLibros aux1 = new PilaDeLibros();
        PilaDeLibros aux2 = new PilaDeLibros();


        Libro item1 = null;
        Libro item2 = null;



        double maxPila1 = 0;
        double maxPila2 = 0;

        while(!pila1.esVacio()){

            item1 = pila1.eliminar();

            if (item1.getPrecio()>maxPila1){

                maxPila1 = item1.getPrecio()  ;
            }
            aux1.adicionar(item1);
        }

        while(!pila2.esVacio()){

            item2 = pila2.eliminar();

            if (item2.getPrecio()>maxPila2){

                maxPila2 = item2.getPrecio()  ;
            }
            aux2.adicionar(item2);
        }

        while(!aux1.esVacio()){

            item1 = aux1.eliminar();

            if (item1.getPrecio()==maxPila1){

                item1.setPrecio(maxPila2)  ;
            }
            pila1.adicionar(item1);

        }



        while(!aux2.esVacio()){

            item2 = aux2.eliminar();

            if (item2.getPrecio()==maxPila2){

                item2.setPrecio(maxPila1)  ;
            }
            pila2.adicionar(item2);

        }



        pila1.mostrar();
        pila2.mostrar();

    }

    public static void agregardescuento(PilaDeLibros pila, double descuento)
    {
        PilaDeLibros aux = new PilaDeLibros();
        descuento/=100;
        Libro item = null;

        double precioDescuento ;

        while(!pila.esVacio()){

            item = pila.eliminar();

            precioDescuento= item.getPrecio()*descuento;

            if (item.getCategoria()=="Historia"){

                item.setPrecio(item.getPrecio()-precioDescuento)  ;
            }
            aux.adicionar(item);
        }


        pila.vaciar(aux);
        pila.mostrar();
    }

    public static void determianrPrecios25s(PilaDeLibros pila, double precio)
    {
        PilaDeLibros aux = new PilaDeLibros();
        int cont =0;
        Libro item = null;
        while(!pila.esVacio()){
            item = pila.eliminar();
            if (item.getPrecio()>precio){
                cont = cont+1;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

        System.out.println("Libros con precio mayor a bs " +precio+" : "+cont);
    }
}
