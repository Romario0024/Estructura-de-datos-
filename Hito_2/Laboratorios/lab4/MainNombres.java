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




    }
    public static void  tienenElNombrePepito(Nombres NOMBS){
        int contador =0;
        String[] nombres = NOMBS.getNombres();

        for(int i = 0;i< nombres.length;i++ ){
            if (nombres[i] == "Pepito"){
                contador++;
            }
        }
        System.out.println("Hay "+contador +" pepitos");
    }
}
