package week6;

public class Teacher extends Person{
    String locationOfUni;
    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void teachingAt(){
        System.out.println(name+" is teaching in "+locationOfUni);
    }
}
