package colas;

public class Main {
    public static void main(String[] args) {

        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(4);
        cola1.adicionar(5);
        cola1.adicionar(6);
        cola1.adicionar(46);
        cola1.adicionar(4);
        cola1.adicionar(54);

        //cola1.mostrar();

        //Eejrcicio1 : Crar un metodo que cuente cuantos numeros de 3 hay en la cola
        //multiplosDe3(cola1, 3);

        //Ejercficio 2:
       EliminarREpetidos(cola1);

    }
    public static void multiplosDe3(ColaDeNumeros cola, int multiplo){
        int contador =0;
        int numElim ;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (cola.esVacio()==false){

            numElim= cola.eliminar();
            if(numElim % multiplo == 0){
                contador+=1;
            }
            aux.adicionar(numElim);
        }
        cola.vaciar(aux);
        System.out.println("Hay "+ contador+ " multiplos de "+ multiplo+ " en la cola");

    }

    public static void EliminarREpetidos (ColaDeNumeros cola){
        ColaDeNumeros aux = new ColaDeNumeros();
        ColaDeNumeros aux2 = new ColaDeNumeros();
        ColaDeNumeros cola2 = new ColaDeNumeros();
        ColaDeNumeros colacontenedo = new ColaDeNumeros();

        int num;
        int num2;
        int max = 0;
int repetido = 0;

        cola2 = cola;
        colacontenedo = cola;

        while(cola.esVacio()==false){
            num = cola.eliminar();

            while(cola2.esVacio()==false){
                num2 = cola2.eliminar();
                if (num2 == num){
                    repetido = num2;
                }
            }
            aux.adicionar(num);
        }


        cola= colacontenedo;

        while(cola.esVacio()==false){
            num = cola.eliminar();

            if(num != repetido){
                aux2.adicionar(num);
            }

        }

        cola.vaciar(aux2);

        cola.mostrar();
    }
}
