package pilas_cadenas;

public class MainCadenas {
    public static void main(String[] args) {
        PilaDeCadenas pilaCadena = new PilaDeCadenas();

        pilaCadena.adicionar("William");
        pilaCadena.adicionar("Andres");
        pilaCadena.adicionar("Ana");
        pilaCadena.adicionar("Josias");
        pilaCadena.adicionar("Iris");
        pilaCadena.adicionar("Jonathan");
        pilaCadena.adicionar("Ilia");



    //    pilaCadena.llenar(6);
        //pilaCadena.mostrar();

        //Ejercicio 1:  crear un metodo en la clase MAIn que permita contar cuantos personas se llaman Andres
       // cuantaAndres(pilaCadena,"Andres");

        // Ejercicio 2: Insertar una cadena entre dos cadenas
      //  insertaNombre(pilaCadena,"Ana");
     //   pilaCadena.mostrar();

        // Ejercicio 3: cambiar el tope por el valor de abajo
       // cambiarNombres(pilaCadena);
       // pilaCadena.mostrar();

        // Ejercicio 4: mover una cadena al tope
     //   cambiarPocision(pilaCadena,3);
      //  pilaCadena.mostrar();

        // Ejercicio 4: mover una cadena al tope(hecha por el ingeniero)
        kesimoPosicion(pilaCadena,3);
        pilaCadena.mostrar();

    }

    public static void kesimoPosicion(PilaDeCadenas pila, int kesimo){
        PilaDeCadenas aux = new PilaDeCadenas();
        String nombreKesimo = "";
        String itemEliminado = "";

        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
                    if(pila.nroElem()==kesimo){
                        nombreKesimo = itemEliminado;
                    }
                    else {
                        aux.adicionar(itemEliminado);
                    }
        }
        pila.vaciar(aux);
        pila.adicionar(nombreKesimo);
    }
/*
    public static void cambiarPocision(PilaDeCadenas pila, int numero) {
        PilaDeCadenas aux = new PilaDeCadenas();
        PilaDeCadenas aux2 = new PilaDeCadenas();
        aux2 = pila;

        String itemEliminado = "";
        String acumulador = "";
        aux.vaciar(pila);

        for (int i = 1; i < numero; i++) {
            aux.eliminar();


        }

        acumulador = aux.eliminar();

        //aux = aux2;
        pila = aux2;
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();

            if(itemEliminado == acumulador){


            }
            else {
                aux.adicionar(itemEliminado);
            };

        }
        aux.adicionar(acumulador);
        pila.vaciar(aux);
    }

*/


    public static void cuantaAndres(PilaDeCadenas pila, String nombre){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        int contador =0;

        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado == nombre){
                // otro forma de hacer una comparacion: if(itemEliminado.equals(nombre){
                contador +=1;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);

        System.out.println("El nombre "+ nombre+" se repite: "+ contador+" veces");
    }

    public static void insertaNombre(PilaDeCadenas pila, String nombre){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";


        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.equals("Josias")){
                aux.adicionar(itemEliminado);
                aux.adicionar(nombre);
            }
           else{
                 aux.adicionar(itemEliminado);
            };


        }

        pila.vaciar(aux);


    }
    public static void cambiarNombres(PilaDeCadenas pila){
        PilaDeCadenas aux = new PilaDeCadenas();
        String item1 = pila.eliminar();
        aux.vaciar(pila);
        String item2 = aux.eliminar();
        pila.adicionar(item1);
        pila.vaciar(aux);
        pila.adicionar(item2);

    }

}
