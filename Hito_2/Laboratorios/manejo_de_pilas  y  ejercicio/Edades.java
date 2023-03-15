package manejo_de_pilas;

public class Edades {
    private String univeridad;
    private String paralelo;
    private int[] edades;

    public Edades  (String univeridad,String paralelo,int[]edades){
        this.univeridad=univeridad;
        this.paralelo=paralelo;
        this.edades=edades;
    }
    public String getUniveridad(){
        return univeridad;
    }
    public String getParalelo(){
        return  paralelo;
    }
    public int[] getEdades(){
        return edades;
    }
    public void setUniveridad(String univeridad){
        this.univeridad = univeridad;
    }
    public void setParalelo(String paralelo){
        this.paralelo=paralelo;
    }
    public void setEdades(int[]edades){
        this.edades=edades;
    }
    public void mostrar(){
        System.out.println("mostrar clase Edades");
        System.out.println("Universidad "+this.univeridad);
        System.out.println("Paralelo"+this.paralelo);

        for(int i=0;i<edades.length;i++){
            System.out.print(edades[i]+", ");
        }
        System.out.println("\n");

    }
}

