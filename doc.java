package week9.overiding;

public class doc extends person{
    String place;

    public doc(String name, int bornYear,String place) {
        super(name, bornYear);
        this.place = place;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm doctor from "+place+".");
    }
    
}
