package ejercicios;

public class Ejercicios {
    private int i;
    private int limit;
    public Ejercicios(){
        this.i = 1;
        this.limit =10;
    }
    public void mostrarMensaje(){
        System.out.println("Hola mundo desde JAVA");
    }
    public void generarNumerosNaturalesPFor(){
        System.out.println("Generar Numeros Naturales For");
        for (int i = 1;i<10;i++){
            System.out.print(i+",");

        }
    }
    public void generarNaturalesParesFor(){
        System.out.println("Generar Numeros Naturales Pares For");
        for (int i = 2;i<=20;i=i+2){

            System.out.print(i+",");
        }
    }
    public void generarNaturalesWhile(){
        System.out.println("generar Numeros Naturales While");
        int i=2;
        while (i<=10){
            System.out.print(i+",");
            i=i+2;

        }
    }







}