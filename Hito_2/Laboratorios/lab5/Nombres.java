package manejo_de_pilas;

public class Nombres {
    String parelelo;
    String[] nombres;

    public Nombres(String parelelo, String[] nombres) {
        this.parelelo = parelelo;
        this.nombres = nombres;
    }

    public String getParelelo() {
        return parelelo;
    }

    public void setParelelo(String parelelo) {
        this.parelelo = parelelo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public void mostrar(){

        System.out.println("Mostrar Nombres");

        for (int i = 0;i < nombres.length;i++ ){
            System.out.print(nombres[i]+", ");

        }
        System.out.println("");

    }
    public void mostrarNombres(){
        for (int i =0;i<this.nombres.length;i++){
            System.out.print(nombres[i]+", ");

        }
        System.out.println();
    }

}
