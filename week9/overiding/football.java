package week9.overiding;

public class football extends person {
    String as;


    public football(String name, int bornYear,String as) {
        super(name, bornYear);
        this.as = as;
    }
    
    public void introduce(){
        super.introduce();
        System.out.println("I'm a footballplayer and work in "+as+" football club");
    }
}
