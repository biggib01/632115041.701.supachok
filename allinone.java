package week9.overiding;

public class allinone {
    public static void main(String[] args) {
        person person1,person2,person3,person4,person5,person6;
        person1 = new person("Mark", 2001);
        person2 = new Sheriff("Mateo",1988,"California");
        person3 = new teacher("Ball", 1977, "CMU");
        person4 = new minister("Tu", 1954, "Thailand");
        person5 = new football("Messi", 1987, "Barcelona"); 
        person6 = new doc("Amd", 1999, "Bangkok");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
}
