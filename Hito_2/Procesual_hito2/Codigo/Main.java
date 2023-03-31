package Tarea_final_hito2;

public class Main {
    public static void main(String[] args) {


        Provincia[] provinciasLaPaz= new Provincia[3];

        Provincia provLP1 = new Provincia("Pacajes");
        Provincia provLP2 = new Provincia("Larecaja");
        Provincia provLP3 = new Provincia("Provincia3");


        provinciasLaPaz [0]=provLP1;
        provinciasLaPaz [1]=provLP2;
        provinciasLaPaz [2]=provLP3;

        Departamento depLapaz =new Departamento("La Paz",20, provinciasLaPaz);


        Provincia[] provinciasCbba= new Provincia[2];

        Provincia provCBBA1 = new Provincia("Arani");
        Provincia provCBBA2 = new Provincia("Ayopaya");

        provinciasCbba [0]=provCBBA1;
        provinciasCbba [1]=provCBBA2;

        Departamento depCbba =new Departamento("Cochabamba",10, provinciasCbba);
//      depCbba.mostrarDepartamento();


        Departamento[] deps = new Departamento[2];
        deps[0] = depLapaz;
        deps[1] = depCbba;

        Pais Bolivia = new Pais("Bolivia", 9, deps);





        Bolivia.mostrarPais();


    }
}
