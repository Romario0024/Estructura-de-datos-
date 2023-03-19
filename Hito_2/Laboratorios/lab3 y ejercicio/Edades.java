package manejo_de_pilas;

import java.sql.SQLOutput;

public class Edades {
    private String universidad;
    private String paralelo;
    private int [] edades;

    public Edades(String universidad, String paralelo, int[] edades){
        this.universidad = universidad;
        this.paralelo = paralelo;
        this.edades = edades;
    }
    public String getUniversidad() {
        return universidad;
    }

    public String getParalelo() {
        return paralelo;
    }

    public int[] getEdades() {
        return edades;
    }

    public void setUniversidad(String universidad){
        this.universidad=universidad;
    }
    public void setParalelo(String paralelo){
        this.paralelo=paralelo;
    }
    public void setEdades(int[] edades){
        this.edades = edades;
    }

    public void mostrar(){
        System.out.println("Mostrar Clase Edades");
        System.out.println("Universidad " + this.universidad);
        System.out.println("Paralelo" + this.paralelo);

        for (int i = 0;i < edades.length;i++ ){
            System.out.print(edades[i]+", ");

        }
        System.out.println("");

    }
}
