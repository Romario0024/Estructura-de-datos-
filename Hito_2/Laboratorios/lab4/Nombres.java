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


}
