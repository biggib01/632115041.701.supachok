package week9.overiding;

public class Sheriff extends person{
    String workState;

    public Sheriff(String name, int bornYear, String wString){
        super(name, bornYear);
        this.workState = wString;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState +".");
    }
}
