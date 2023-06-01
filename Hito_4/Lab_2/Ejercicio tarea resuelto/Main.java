package colas;
public class Main {
    public static void main(String[] args) {

        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(4);
        cola1.adicionar(54);
        cola1.adicionar(5);
        cola1.adicionar(54);
        cola1.adicionar(54);
        cola1.adicionar(54);
        cola1.adicionar(3);

        //Ejercficio 2:
        EliminarRepetidos_v2(cola1);

       // verificaRepetidos(cola1, 4);

    }

    public static void EliminarRepetidos_v2(ColaDeNumeros cola) {
        int nroElem ;
        int comp = cola.nroElem();
        int item ;
        int repetido =1;

        while (repetido > 0){
            repetido = 0;
            nroElem = cola.nroElem();

            for (int i = 1; i <= nroElem; i++) {
                item = cola.eliminar();
                if(verificaRepetidos(cola,item) == true){
                    repetido = item;
                }
                cola.adicionar(item);

            }

            for (int i = 1; i <= nroElem; i++) {
                item = cola.eliminar();
                if (item != repetido){
                    cola.adicionar(item);
                }

            }
        }

        cola.mostrar();

    }

    public static boolean verificaRepetidos(ColaDeNumeros cola, int num){
        int cont =0;
        int item =0;



        int numElem = cola.nroElem();

        for (int i = 1; i <= numElem; i++){
            item = cola.eliminar();
            if(item == num){
                cont++;
            }
            cola.adicionar(item);
        }

        if(cont > 0){
           return true;
        }
        else{
            return false;
        }

    }
}