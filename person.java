package week9.overiding;

public class person {
    String name;
    int bornYear;

    public person(String name , int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce(){
        System.out.print("My name is "+ name + " , ");
        System.out.println("I was born in "+ bornYear +".");
    }
}
