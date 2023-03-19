package manejo_de_pilas;

public class Main {
    public static void main (String[] args){
//cambiar los datos de ambos arreglos, segun las fotografias que tomamos xd
        int [] edadesEDD= new int [5];
        edadesEDD [0]= 33;
        edadesEDD [1]= 19;
        edadesEDD [2]= 20;
        edadesEDD [3]= 42;
        edadesEDD [4]= 25;
        int [] edadesDBII = new int [5];
        edadesDBII [0]= 30;
        edadesDBII [1]= 20;
        edadesDBII [2]= 19;
        edadesDBII [3]= 15;
        edadesDBII [4]= 25;


        Edades par1 = new Edades("Unifranz"," EDD",edadesEDD);
        Edades par2 = new Edades("Unifranz"," BDA II",edadesDBII);
       // par1.mostrar();


       determinaEdadMayor(par1);

       // determinar edad mayor

       // sumarEdades(paralelo1);
        //Ejercicio tarea para la siguiente clase
        //  intercambiaValores(par1,par2);
        //ejercicio cambio en uno solo array
        intercambiaValoresUnArray(par1);
    }

    //ejercicio para determinar el numero mayor

    public static int determinaEdadMayor(Edades par1) {


        int[]edades = par1.getEdades();
        int mayorEdad = edades[0];
        for(int i =1;i<edades.length;i++){
            if(edades[i]>mayorEdad){
                mayorEdad =edades[i];
            }
        }
        //System.out.println("Edad mayor: "+mayorEdad);
        return mayorEdad;

    }
    public static int determinaEdadMenor(Edades par2) {


        int[]edades = par2.getEdades();
        int menorEdad = edades[0];
        for(int i =1;i<edades.length;i++){
            if(edades[i]<menorEdad){
                menorEdad =edades[i];
            }
        }
        //System.out.println("Edad mayor: "+mayorEdad);
        return menorEdad;

    }



    //Ejercicio de suma de edades
    /*
    public static void sumarEdades(Edades paralelo1) {


        int[]edades = paralelo1.getEdades();

        for(int i =1;i<edades.length;i++){
            if(edades[i]%2==0){
                edades[i]= edades[i]+5;
            }
        }

        paralelo1.setEdades(edades);
        paralelo1.mostrar();

    }
    */


    public static void intercambiaValores(Edades par1, Edades par2) {

        int mayorEDD = determinaEdadMayor(par1);
        System.out.println("Mayor edad par EDD "+mayorEDD);

        int mayorBDII = determinaEdadMayor(par2);
        System.out.println("Mayor edad par DBII "+mayorBDII);

        int menorEDD = determinaEdadMenor(par1);
        System.out.println("Menor edad par EDD "+menorEDD);

        int menorBDII = determinaEdadMenor(par2);
        System.out.println("Menor edad par DBII "+menorBDII);

        int[] edadesEDD = par1.getEdades();

        for (int i=0;i<edadesEDD.length;i++){
            if (edadesEDD[i]== mayorEDD){
                edadesEDD[i]=mayorBDII;
            }

        }


        int[] edadesBDII = par2.getEdades();

        for (int i=0;i<edadesBDII.length;i++){

            if (edadesEDD[i]== mayorBDII){
                edadesEDD[i]=mayorBDII;
            }

        }



        for (int i=0;i<edadesEDD.length;i++){
            if (edadesEDD[i]== menorEDD){
                edadesEDD[i]=menorBDII;

            }

        }



        for (int i=0;i<edadesBDII.length;i++){

            if (edadesEDD[i]== menorBDII){
                edadesEDD[i]=menorBDII;
            }

        }

        par1.mostrar();
        par2.mostrar();

    }

    public static void intercambiaValoresUnArray(Edades par1) {
        int mayorEDD = determinaEdadMayor(par1);
        System.out.println("Mayor edad par EDD "+mayorEDD);

        int menorEDD = determinaEdadMenor(par1);
        System.out.println("Menor edad par EDD "+menorEDD);

        int[] edadesEDD = par1.getEdades();



        for (int i=0;i<edadesEDD.length;i++){


            if (edadesEDD[i]== menorEDD){

                edadesEDD[i]=mayorEDD;


            }

        }

        for (int j = 0; j<edadesEDD.length;j++){
            if (edadesEDD[j]== mayorEDD){

                edadesEDD[j]=menorEDD;
            }


        }



        par1.mostrar();

    }
}
