package PilaDeClientes;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alfonso","Honzo",42,"Abel Iturralde. Av. New Buidings","masculino");
        Cliente cliente2 = new Cliente("Abigail","Choque",18,"Pedro Domingo Murillo Av. Buena vida","femenino");
        Cliente cliente3 = new Cliente("Benito","Rivers",35,"Pacajes Calle Aamaritano","masculino");
        Cliente cliente4 = new Cliente("Carla","Torres",59,"Larecaja Avenida 15","femenino");
        Cliente cliente5 = new Cliente("Rodrigo","Suarez",12,"Caranavi Calle Bonle","masculino");

        PilaCliente pilaDeClientes = new PilaCliente();
        pilaDeClientes.adicionar(cliente1);
        pilaDeClientes.adicionar(cliente2);
        pilaDeClientes.adicionar(cliente3);
        pilaDeClientes.adicionar(cliente4);
        pilaDeClientes.adicionar(cliente5);

       // pilaDeClientes.mostrar();

        // Ejercicio 12: Determinar cuantos CLIENTES son mayores de 20 años
       // mayoresCiertaEdad(pilaDeClientes, 20);

        // Ejercicio 13: Mover el k-esimo elemento al final de la pila
      //  kEsimoPosicion(pilaDeClientes, 3);

        // Ejercicio 14: Cambiar la direccion de algunos CLIENTES de la PILA
       // asignaDireccion(pilaDeClientes, "Omasuyos Av. Siempre Viva");

        // Ejercicio 15: Mover ITEMS de la PILA.
        reordenaPila(pilaDeClientes);
    }
    public static void reordenaPila(PilaCliente pila){
        PilaCliente auxM = new PilaCliente() ;
        PilaCliente auxF = new PilaCliente();
        Cliente client = null;

        while (!pila.esVacio()){
            client = pila.eliminar();
            if (client.getGenero() == "masculino"){
                auxM.adicionar(client);
            }
            else if (client.getGenero() == "femenino"){
                auxF.adicionar(client);
            }
        }

        pila.vaciar(auxM);
        pila.vaciar(auxF);

        pila.mostrar();

    }
    public static void asignaDireccion(PilaCliente pila, String nuevaDireccion) {
        PilaCliente aux = new PilaCliente();
        Cliente client = null;

        while (!pila.esVacio()){
            client = pila.eliminar();
            if (client.getGenero() == "femenino"){
                client.setDireccion(nuevaDireccion);
            }
            aux.adicionar(client);
        }

        pila.vaciar(aux);

        pila.mostrar();
    }
    public static void kEsimoPosicion(PilaCliente pila, int valorTope){
        PilaCliente aux = new PilaCliente();

        Cliente client = null;
        Cliente valor = null;

        int contador =0;

        aux.vaciar(pila);

        while (!aux.esVacio()){
            client = aux.eliminar();
            contador+=1;

            if(contador == valorTope){
                    valor = client;
                    continue;
            }
            pila.adicionar(client);
        }
        pila.adicionar(valor);

        pila.mostrar();
    }

    public static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){

        Cliente client = null;
        int contador = 0;
        while (!pila.esVacio()){
            client = pila.eliminar();
            if(client.getEdad() > edadMayor){
                contador+=1;
            }
        }
        System.out.println("Hay "+contador+" cliente(s) con " + edadMayor+ "año(s) de edad");
    }

}
