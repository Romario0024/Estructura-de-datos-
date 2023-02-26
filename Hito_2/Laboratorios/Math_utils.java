package ejercicios;

import javax.swing.plaf.synth.SynthTextAreaUI;

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
        for (int i= 0;i<=limit;i++){
            System.out.print(i+",");
        }
    }
    public void generatePairNumbers(int limit){

    }
    public void getExtencionFromCI(String ci){

    }
}
