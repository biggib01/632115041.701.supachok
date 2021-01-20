package week6;

public class Doctor extends Person{
    String genre;
    public Doctor(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void heal(){
        System.out.println(name+" is " +genre);
    }
}
