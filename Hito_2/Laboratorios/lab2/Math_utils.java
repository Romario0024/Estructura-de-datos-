package ejercicios;

public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP,String version,int year){
        this.nameAPP = nameAPP ;
        this.version =version;
        this.year = year;
    }
    public void printApp(){
        System.out.println(this.nameAPP+" - "+ this.version+" - "+ this.year);

    }

    public void generateNaturalNumbers(int limit){
        System.out.println("Generando numeros Naturales (FOR)");
        for (int i= 0;i<=limit;i++){
            System.out.print(i+",");
        }
    }
    public void generatePairNumbers(int limit){
        System.out.println("Generando numeros pares(FOR)");

        for (int i =0;i<=limit;i+=2){
            System.out.print(i+" - ");
        }

        System.out.println();
    }
    public void getExtensionFromCI(String ci){
        System.out.println("Muestra extencion de la CEDULA");

        String ext = "";

        //68856338LP
        ext = ci.substring(8);

        System.out.println("Extension = "+ext);

    }
}