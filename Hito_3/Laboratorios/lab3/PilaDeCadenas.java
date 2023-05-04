package pilas_cadenas;


import java.util.Scanner;

public class PilaDeCadenas {
    private int max;
    private int tope;
    private String[] cadenas;

    public PilaDeCadenas (){
        this.max = 10;
        this.tope = 0;
        this.cadenas = new String[this.max +1];
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
    public void adicionar(String nuevoCadena){
        if(esLlena()){
            System.out.println("PILA LLENA");
        }else{
            tope = tope +1;
            cadenas[tope] = nuevoCadena;
        }

    }
    public String eliminar (){
        String itemEliminado ="";
        if(esVacio()){
            System.out.println("PILA VACIA");
        }
        else{
            itemEliminado = cadenas[tope];
            tope = tope-1;
        }
        return itemEliminado;
    }
    public void vaciar (PilaDeCadenas pila){
        while(!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }
    public void llenar (int nroItems){
        Scanner leer = new Scanner(System.in);
        String nombre ="";

        System.out.println("Llenando la pila de Nombres(cadenas)");

        for (int i = 0 ; i<nroItems ; i++){
            System.out.print("Ingrese el nombre:"+(i+1)+": ");
            nombre = leer.nextLine();
            adicionar(nombre);
            System.out.println();
        }
    }
    public void mostrar(){
        String item = "";
        if(esVacio()){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE CADENAS");
            PilaDeCadenas pilaAuxiliar = new PilaDeCadenas();
            while (!esVacio()){
                item = eliminar();
                System.out.println(item+",");
                pilaAuxiliar.adicionar(item);
            }
            vaciar(pilaAuxiliar);
        }
    }

}
