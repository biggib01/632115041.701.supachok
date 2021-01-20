package week6;

public class Person {
    String gender;
    String name;
    int age;
    public Person(){
        
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is "+name + " gender is " +gender);
    }
}