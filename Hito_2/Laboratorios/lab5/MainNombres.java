package manejo_de_pilas;

public class MainNombres {
    public static void main(String[] args) {

        String[] NombresEDD = new String[5];
        NombresEDD [0] = "Juan";
        NombresEDD [1] = "Pedro";
        NombresEDD [2] = "Esteban";
        NombresEDD [3] = "Pepito";
        NombresEDD [4] = "Timi";

        Nombres NOMBS = new Nombres("EDD", NombresEDD);
        //crear un metodo estatico que determine cuantas personas del paralelo EDD tiene el  nombre pepito

        tienenElNombrePepito(NOMBS);

        int c= cuentaNombres(NOMBS, "Pepito");
        System.out.println("Pepito se repite: "+c+" veces");
        //Forma 1: funcion que agrega un nombre
         AgregarNuevoNombre(NOMBS, "Ned");
         NOMBS.mostrar();

       // Forma 2:funcion que agrega un nombre
        AgregarNuevoNombre2(NOMBS, "Romario");
        AgregarNuevoNombre2(NOMBS, "Vilma");

        // NOMBS.mostrarNombres();
        //Ejercicio
        AgregarNuevoNombre3(NOMBS, "Romario");
        NOMBS.mostrarNombres();
    }
    public static void  tienenElNombrePepito(Nombres NOMBS){
        int contador =0;
        String[] nombres = NOMBS.getNombres();

        for(int i = 0;i< nombres.length;i++ ){
            if (nombres[i] == "Timi"){
                contador++;
            }
        }
        System.out.println("Hay "+contador +" pepitos");
    }
    public static int cuentaNombres(Nombres NOMBS, String nombreBuscar){
        String[] nombres = NOMBS.getNombres();

        int contador=0;
        for(int i=0;i<nombres.length;i++){
            if(nombres[i]==nombreBuscar){
                contador+=1;
            }
        }
        return contador;
    }
    //Ejercicio: Forma1: Crear un  metodo estatico que permita agrefar un nombre a un array ya existenete

    public static void AgregarNuevoNombre(Nombres NOMBS, String nombreAgregar){
        String[] nombres = NOMBS.getNombres();
        String[] nombres2 = new String[6];
        nombres2 [0] = nombreAgregar;
        for (int i=1;i<nombres2.length;i++){
            nombres2[i]=nombres[i-1];
        }

        NOMBS.setNombres(nombres2);
    }
   // Ejercicio: Forma2: Crear un  metodo estatico que permita agrefar un nombre a un array ya existenete
    public static void AgregarNuevoNombre2(Nombres NOMBS, String nombreAgregar){
        String[] nombresOri = NOMBS.getNombres();
        String[] nuevosNombres = new String[nombresOri.length +1];

        nuevosNombres[0]=nombreAgregar;

        for (int i =0; i < nombresOri.length; i++){
            nuevosNombres [i+1]= nombresOri[i];
        }

        NOMBS.setNombres(nuevosNombres);

    }

    public static void AgregarNuevoNombre3(Nombres NOMBS, String nuevoNombre){
        String[] nombresOri = NOMBS.getNombres();
        String[] nuevosNom = new String[nombresOri.length +1];

        for(int i=0;i<nombresOri.length;i++){
            nuevosNom[i]=nombresOri[i];
        }
        nuevosNom[nombresOri.length]=nuevoNombre;
        NOMBS.setNombres(nuevosNom);
    }



}
