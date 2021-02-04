package week9.overiding;

public class minister extends person{
    String country;

    public minister(String name, int bornYear,String country) {
        super(name, bornYear);
        this.country = country;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and work in "+country);
    }

    
    

}
