package Tarea_final_hito2;

public class Departamento {
    String nombre;
    int nroProvincias;
    Provincia[] provincias;

    public Departamento(String nombre,int nroProvincias, Provincia[] provincias) {
        
        this.nombre = nombre;
        this.nroProvincias=nroProvincias;
        this.provincias = provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }
    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setprovincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public void mostrarDepartamento() {
        System.out.println("El nombre del Departamento es: " + getNombre());
        for (int i = 0; i < getProvincias().length; i++) {
            this.getProvincias()[i].mostrarProvincia();
        }
    }
}


