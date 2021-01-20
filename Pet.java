package week7;

public class Pet {
    String name="";
    String specie="";
    String color="";
    int age = 0;

    public void showPetData(String name, String specie, String color, int age) {
        System.out.println("Neme : " + name+ "\nSpecie : " + specie +"\nColor : "+color +"\nAge : " + age+" year");
    }
}
