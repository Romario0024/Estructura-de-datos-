package colas;

public class ColaDeNumeros {
    private int max;
    private int ini;
    private int fin;
    private int[] numeros ;
    public ColaDeNumeros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max +1];
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
    public void adicionar(int nuevoNumero){
        if(esLlena()==true){
            System.out.println("COLA LLENA");
        }else{
            fin = fin +1;
            numeros[fin] = nuevoNumero;
        }
    }

    public int eliminar (){
        int elemento =0;
        if(esVacio()==true){
            System.out.println("COLA VACIA");
        }
        else{
            ini = ini+1;
            elemento = numeros[ini];

        }
        if (ini == fin){
            ini =0;
            fin = 0;
        }
        return elemento;
    }
    public int nroElem(){
        return fin - ini;
    }
    public void vaciar (ColaDeNumeros cola){
        while(cola.esVacio()==false){
            adicionar(cola.eliminar());
        }
    }
    public void mostrar(){
        int item =0;
        if(esVacio()== true){
            System.out.println("No hay numeros que mostrar");
        }
        else{
            System.out.println("Mostrando la COLA DE NUMEROS");
            ColaDeNumeros colaAuxiliar = new ColaDeNumeros();
            while (esVacio()==false){
                item = eliminar();
                System.out.println("Valor : "+item);
                colaAuxiliar.adicionar(item);
            }
            vaciar(colaAuxiliar);
        }
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
}
