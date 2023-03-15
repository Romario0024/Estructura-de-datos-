package manejo_de_pilas;

public class Main {
    public static void main(String[] args) {

        int []edades=new int[5];
        edades[0]=33;
        edades[1]=20;
        edades[2]=19;
        edades[3]=42;
        edades[4]=25;
        int []edades2=new int[5];
        edades2[0]=30;
        edades2[1]=20;
        edades2[2]=19;
        edades2[3]=15;
        edades2[4]=25;
        int []acumulador=new int[5];
        acumulador[0]=33;
        acumulador[1]=20;
        acumulador[2]=19;
        acumulador[3]=42;
        acumulador[4]=25;

        Edades obj1= new Edades("Unifranz", "EDT",edades);
        Edades obj2= new Edades("Unifranz", "BDA",edades2);
        Edades obj3 = new Edades("Unifranz", "EDT",acumulador);
  //      obj1.mostrar();


        //Ejercicio tarea para la sigiente clase
        interccambiaValores(obj1,obj2, obj3);


        //determinar edad mayor
        determinaEdadMayor(obj1);
        //Ejercicio para sumar edades
        sumarEdades(obj1);

    }

    public static void determinaEdadMayor(Edades obj1) {

        int[]edades=obj1.getEdades();
        int mayorEdad = edades[0];
        for(int i=1;i<edades.length;i++){
            if(edades[i]>mayorEdad){
                mayorEdad=edades[i];
            }
        }
        System.out.println("Edad mayor : "+mayorEdad);
    }
    public static void sumarEdades(Edades obj1){
        System.out.println("Suma de edades");
        int[]edades =obj1.getEdades();

        for (int i=1;i< edades.length;i++){
            if(edades[i]%2==0){
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades((edades));
        obj1.mostrar();
    }

    public static void interccambiaValores(Edades obj1,Edades obj2,Edades obj3){


        int[]edades =obj1.getEdades();
        int[]edades2 =obj2.getEdades();
        int[]acumulador=obj3.getEdades();

        for(int i = 0; i<edades.length;i++){

            if(edades[i]==edades[2]){

                edades[2]=edades2[3];
                edades2[3]=acumulador[2];
                System.out.println(acumulador[2]);
                System.out.println(edades2[3]);
            }
            else if (edades[i]==edades[3]) {

                edades[3]=edades2[0];
               edades2[0]=acumulador[3];
                System.out.println(acumulador[3]);
             System.out.println(edades2[0]);
            }

        }


        obj1.setEdades((edades));
        obj1.mostrar();
        obj2.setEdades((edades2));
        obj2.mostrar();



    }

}
