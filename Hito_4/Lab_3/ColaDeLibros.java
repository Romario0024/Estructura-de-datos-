package colas.Objetos;

    public class ColaDeLibros {
        private int max;
        private int ini;
        private int fin;
        private Libro[] libros ;
        public ColaDeLibros(){
            this.max = 100;
            this.ini = 0;
            this.fin = 0;
            this.libros = new Libro[this.max + 1];
        }
        public boolean esVacio(){
            if (ini == 0 && fin == 0){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean esLlena(){
            if ( fin == max){
                return true;
            }
            else{
                return false;
            }
        }
        public void adicionar(Libro nuevoLibro){

            if(esLlena()){
                System.out.println("LA COLA ESTA LLENA!");
            }else{
                fin = fin +1;
                libros[fin] = nuevoLibro;
            }
        }

        public Libro eliminar (){
            Libro elemento = null;
            if(esVacio()){
                System.out.println("LA COLA ESTA VACIA!!");
            }
            else{
                ini = ini+1;
                elemento = libros[ini];

            }
            if (ini == fin){
                ini = fin = 0;
            }
            return elemento;
        }
        public int nroElem(){
            return fin - ini;
        }
        public int getIni() {
            return ini;
        }

        public int getFin() {
            return fin;
        }
        public void vaciar (ColaDeLibros cola){
            while(!cola.esVacio()){
                adicionar(cola.eliminar());
            }
        }
        public void mostrar(){
            if(esVacio()){
                System.out.println("No hay libros que mostrar");
            }
            else{
                Libro elemEliminado;
                System.out.println("Mostrando la COLA DE LIBROS");
                ColaDeLibros aux = new ColaDeLibros();
                while (!esVacio()){
                    elemEliminado = eliminar();
                    elemEliminado.mostrar();
                    aux.adicionar(elemEliminado);
                }
                vaciar(aux);
            }
        }

    }


