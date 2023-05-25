package colas;
public class Main {
    public static void main(String[] args) {

        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(6);
        cola1.adicionar(5);
        cola1.adicionar(4);
        cola1.adicionar(46);
        cola1.adicionar(4);
        cola1.adicionar(54);

        //cola1.mostrar();

        //Ejercficio 2:
        EliminarREpetidos(cola1);

    }

    public static void EliminarREpetidos(ColaDeNumeros cola) {
        ColaDeNumeros aux = new ColaDeNumeros();

        int num;
        int num2;

        int repetido = 0;
        int contador =0;

        while (!cola.esVacio()) {
            num = cola.eliminar();
            while (!cola.esVacio()) {
                num2 = cola.eliminar();
                 if(num==num2){
                     repetido=num2;
                 }
                 aux.adicionar(num2);
            }
            aux.adicionar(num);
            cola.vaciar(aux);
            contador++;

            if (contador == cola.nroElem()){
                break;
            }
        }

        while(!cola.esVacio()){
            num = cola.eliminar();

            if(num != repetido){
                aux.adicionar(num);
            }

        }

        cola.vaciar(aux);
        cola.mostrar();
    }
}