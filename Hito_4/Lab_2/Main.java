package colas;

public class Main {
    public static void main(String[] args) {

        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(4);
        cola1.adicionar(5);
       // cola1.adicionar(5);
        cola1.adicionar(6);
        cola1.adicionar(46);
        cola1.adicionar(4);
        cola1.adicionar(54);

        //cola1.mostrar();

        //Eejrcicio1 : Crar un metodo que cuente cuantos numeros de 3 hay en la cola
        //multiplosDe3(cola1, 3);

        //Ejercficio 2: Eliminar toidos lios valores de la cola que sean repetidos
       //EliminarRepetidos(cola1);

       //Ejercicio 2: Hecho por el ingeniero
        EliminarRepetidos_v2(cola1);

        //Metodo para verificar repetidos (Heecho por el ingeniero)
       //verificaRepetidos(cola1,6);;

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

    public static void EliminarRepetidos(ColaDeNumeros cola) {


        int num;
        int num2;

        int repetido = 0;
        int contador =0;

        while (!cola.esVacio()) {
            num = cola.eliminar();
            if(verificaRepetidos(cola,num) == true){
                repetido = num;
            }
            cola.adicionar(num);

            contador++;

            if (contador == cola.nroElem()){
                break;
            }
        }
        cola.mostrar();
        System.out.println(cola.nroElem());

        while(!cola.esVacio()){
            contador = 0;
            num = cola.eliminar();

            if(num != repetido){
                cola.adicionar(num);
                contador++;
            }



            if (contador == cola.nroElem()){
                break;
            }
        }
        cola.mostrar();




    }



    public static void EliminarRepetidos_v2(ColaDeNumeros cola) {
        int nroElem ;
        int comp = cola.nroElem();
        int item ;
        int repetido =1;

        while (repetido >0 ){
            repetido = 0;
            nroElem = cola.nroElem();

            for (int i = 1; i <= nroElem; i++) {
                item = cola.eliminar();
                if(verificaRepetidos(cola,item) == true){
                    repetido = item;
                }
                cola.adicionar(item);

            }

            for (int i = 1; i < nroElem; i++) {
                item = cola.eliminar();
                if (item != repetido){
                    cola.adicionar(item);
                }

            }
        }
        System.out.println(cola.nroElem());

        cola.mostrar();
        int nume = 0 ;
        if ( cola.nroElem() % 2 ==0){
            while (nume  < cola.nroElem()+1 ){
                item = cola.eliminar();
                cola.adicionar(item);
                nume++;
            }
        }
        else{
            while (nume  <= cola.nroElem()+2 ){
                item = cola.eliminar();
                cola.adicionar(item);
                nume++;
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
