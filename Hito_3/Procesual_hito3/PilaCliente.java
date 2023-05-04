package PilaDeClientes;

public class PilaCliente {
        private int max;
        private int tope;
        private Cliente[] Cliente;

        public PilaCliente() {
            this.max = 10;
            this.tope = 0;
            this.Cliente = new Cliente[this.max + 1];
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

        public void adicionar(Cliente nuevoCliente) {

            if (esLlena()) {
                System.out.println("PILA DE CLIENTES LLENA");
            } else {
                tope = tope + 1;
                Cliente[tope] = nuevoCliente;
            }

        }

        public Cliente eliminar() {
            Cliente clienteEliminado = null;
            if (esVacio()) {
                System.out.println("PILA DE LIBROS VACIA");
            } else {
                clienteEliminado = Cliente[this.tope];
                tope = tope - 1;
            }
            return clienteEliminado;
        }

        public void vaciar(PilaCliente pila) {
            while (!pila.esVacio()) {
                adicionar(pila.eliminar());
            }
        }

        public void mostrar() {
            Cliente cliente = null;
            if (esVacio()) {
                System.out.println("No hay clientes que mostrar");
            } else {

                System.out.println("\n Mostrando la PILA DE CLIENTES");
                PilaCliente aux = new PilaCliente();
                while (!esVacio()) {
                    cliente = eliminar();
                    aux.adicionar(cliente);
                    cliente.mostrarLibro();
                }
                vaciar(aux);
            }
        }
}
