package manejo_de_pilas;

public class MainPilaNumeros {
    public static void main(String[] args) {


        PilaNumeros pila1 = new PilaNumeros();

        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);


       // Ejercicio 1: Encontrar el numero mayor de la pila
        // muestraNumeroMaximo(pila1);

      //Ejercicio 2: Contar todos los cinco en la pila
        //determinasNumeros5(pila1,5);
        //pila1.mostrar();

        // Ejercicio dejado como tarea por el docente de EDD.
        //intercambioDeNumeros(pila1);

        // Ejercicio3 : Mueswtra pares e impares
       //  pares_impares(pila1);

          //Ejercicio 4 : agregrar un numero a la base de la pila
          //agregarItem(pila1);
         //Version del inegeniro:---------------------------
         // agregarBase(pila1,100 );
        //pila1.mostrar();



    }

    public static void PilaString(PilaNumeros pila, int item){

    }
    public static void agregarBase(PilaNumeros pila, int item){
        PilaNumeros aux = new PilaNumeros();
        aux. vaciar(pila);
        aux.adicionar(item);
        pila.vaciar(aux);
    }
    public static void agregarItem(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int numeroAgregar= 100;

        while(!pila.esVacio()){
            aux.adicionar(pila.eliminar());
        }

        pila.adicionar(numeroAgregar);

        while(!aux.esVacio()){
            pila.adicionar(aux.eliminar());
        }

        pila.mostrar();
    }
    public static void pares_impares(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int pares =0;
        int numElim =0;
        int impares =0;

        while (pila.esVacio()==false){
            numElim= pila.eliminar();
            if(numElim %2==0){
                pares+=1;
            }
            aux.adicionar(numElim);
        }
        System.out.println("pares :"+pares);
        while (aux.esVacio()==false){
            numElim= aux.eliminar();
            if(numElim %2!=0){
                impares+=1;
            }
            pila.adicionar(numElim);
        }

        System.out.println("impares :"+impares);
    }

    public static void muestraNumeroMaximo(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int num;
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





    public static void intercambioDeNumeros(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int num;
        int max = 0;
        int min;
        //Obtenemos el numero mayor
        while(!pila.esVacio()){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        System.out.println("MAYOR: "+max);
        //Obtenemos el numero Menor
        min = max;
        while(!aux.esVacio()){
            num = aux.eliminar();
            if(num < min){
                min = num;
            }
            pila.adicionar(num);
        }
        System.out.println("MENOR: "+min);
        //Reemplazamos el numero mayor por el menor y viceversa
        int acumulador ;
        while(!pila.esVacio()){
            acumulador = pila.eliminar();
            if(acumulador==max){
                aux.adicionar(min);
            }
            else if(acumulador==min){
                aux.adicionar(max);
            }
            else{
                aux.adicionar(acumulador);
            }
        }
        //Una vez cambiado los valores, retornamos los valores a la pila original y en el orden correcto. Y mostramos
        while(!aux.esVacio()){
            pila.adicionar(aux.eliminar());
        }
        pila.mostrar();

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