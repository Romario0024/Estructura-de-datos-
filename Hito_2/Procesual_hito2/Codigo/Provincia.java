package Tarea_final_hito2;

public class Provincia {
    String nombre;

    public Provincia(String nombre) {
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarProvincia(){

        System.out.println("Provincia:" +this.getNombre());
    }
}
