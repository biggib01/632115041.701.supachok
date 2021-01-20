package week6;

public class Engineer extends Person{
    String genre;
    public Engineer(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void doJob(){
        System.out.println(name+" is " +genre);
    }
}
