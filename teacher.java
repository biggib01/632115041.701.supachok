package week9.overiding;

public class teacher extends person{
    String university;

    public teacher(String name, int bornYear, String university){
        super(name, bornYear);
        this.university = university;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I’m a teacher and teach the students in "+university);
    }
}
