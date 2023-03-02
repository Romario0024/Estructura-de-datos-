package ejercicios;
public class Student {
    private  String fullname;
    private String lastname;
    private int age;
    public void Student(String fullname, String lastname, int age){
        this.fullname=fullname;
        this.lastname=lastname;
        this.age = age;
    }
    public String getFullName(){
        return this.fullname;
    }
    public void setFullName(String fullname){
       this.fullname=fullname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }

}
