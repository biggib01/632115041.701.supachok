package week6;

public class Student extends Person{
    String studyProgramme;
    public Student(String name, int age, String gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void study(){
        System.out.println(name+" is studing in "+studyProgramme);
    }
}
