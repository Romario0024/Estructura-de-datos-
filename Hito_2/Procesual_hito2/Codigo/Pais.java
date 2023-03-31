package Tarea_final_hito2;

public class Pais {
    String nombre;
    int nroDepartamentos;
    Departamento[] departementos;


    public Pais() {
        this.nombre = "Bolivia";
        this.nroDepartamentos = 9;

    }
    public Pais(String nombre, int nroDep, Departamento[] departamento) {
        this.nombre = nombre;
        this.nroDepartamentos = nroDep;
        this.departementos = departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNroDepartamentos() {
        return nroDepartamentos;
    }
    public void setNroDepartamentos(int nroDepartamentos) {
        this.nroDepartamentos = nroDepartamentos;
    }
    public Departamento[] getDepartementos() {
        return departementos;
    }

    public void setDepartementos(Departamento[] departamentos) {
        this.departementos = departamentos;
    }

    public void mostrarPais(){
    System.out.println("El nombre del Pais es: "+getNombre());
    System.out.println(getNroDepartamentos());
        for(int i=0;i<getDepartementos().length;i++){
        this.getDepartementos()[i].mostrarDepartamento();
        }
    }

}






