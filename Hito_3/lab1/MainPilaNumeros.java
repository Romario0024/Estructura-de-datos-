package manejo_de_pilas;

public class MainPilaNumeros {
    public static void main(String[] args) {


        PilaNumeros pila1 = new PilaNumeros();

        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);


       // pila1.mostrar();


        muestraNumeroMaximo(pila1);

       // pila1.mostrar();

        determinasNumeros5(pila1,5);
         pila1.mostrar();

    }
    public static void muestraNumeroMaximo(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int max = 0;

        while(pila.esVacio()==false){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        aux.vaciar(aux);
        System.out.println("MAYOR: "+max);


    }
    public static void determinasNumeros5(PilaNumeros pila,int numeroBuscado){
        PilaNumeros aux = new PilaNumeros();
        int contador =0;
        int numElim =0;

        while (pila.esVacio()==false){
            numElim= pila.eliminar();
            if(numElim == numeroBuscado){
                contador+=1;
            }
            aux.adicionar(numElim);
        }

        pila.vaciar(aux);
        System.out.println("El numero:  "+ numeroBuscado+" se repite "+ contador+"veces");

    }


}
