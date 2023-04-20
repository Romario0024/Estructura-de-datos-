package manejo_de_pilas;

public class PilaNumeros {
        private int max;
        private int tope;
        private int[] numeros;

        public PilaNumeros (){
                this.max = 10;
                this.tope = 0;
                this.numeros = new int[this.max +1];
        }
        public boolean esVacio(){
                if(tope == 0){
                        return true;
                }
                else{
                        return false;
                }
        }
        public boolean esLlena(){
                if(tope == max){
                        return true;
                }
                else{
                        return false;
                }
        }
        public int nroElem(){
                return tope;
        }
        public void adicionar(int nuevoNumero){
                if(esLlena()==true){
                        System.out.println("PILA LLENA");
                }else{
                        tope = tope +1;
                        numeros[tope] = nuevoNumero;
                }

        }
        public int eliminar (){
           int itemEliminado =0;
           if(esVacio()==true){
                   System.out.println("PILA VACIA");
           }
           else{
                   itemEliminado = numeros[tope];
                   tope = tope-1;
           }
           return itemEliminado;
        }
        public void vaciar (PilaNumeros pila){
                while(pila.esVacio()==false){
                        adicionar(pila.eliminar());
                }
        }
        /*
        public void llenar (PilaNumeros pila){
                while(pila.esVacio()==false){
                        adicionar(pila.eliminar());
                }
        }

         */
        public void mostrar(){
                int item =0;
                if(esVacio()== true){
                        System.out.println("No hay items que mostrar");
                }else{
                        System.out.println("Mostrando la PILA DE NUMEROS");
                        PilaNumeros pilaAuxiliar = new PilaNumeros();
                        while (esVacio()==false){
                                item = eliminar();
                                System.out.println(item+",");
                                pilaAuxiliar.adicionar(item);
                        }
                        vaciar(pilaAuxiliar);
                }
        }


}
