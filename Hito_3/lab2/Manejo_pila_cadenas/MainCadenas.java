package pilas_cadenas;

public class MainCadenas {
    public static void main(String[] args) {
        PilaDeCadenas pila1 = new PilaDeCadenas();

        pila1.adicionar("William");
        pila1.adicionar("Andres");
        pila1.adicionar("Josias");
        pila1.adicionar("Iris");
        pila1.adicionar("Jonathan");
        pila1.adicionar("Ilia");

        pila1.mostrar();
    }
}
