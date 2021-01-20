package week7;

public class bird extends Pet {
    String country = "Argentina";
    boolean canFly = true;

    void speak(){
        System.out.println("My bird can speak");
    }

    void checkCountry(){
        System.out.println("Country :"+country);
    }

    boolean isCanFly(){
        if(canFly == true){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        bird bird = new bird();

        System.out.println("My bird");
        bird.showPetData("Monmon", "Budgerigar", "Green", 1);
        bird.speak();
        bird.checkCountry();
        System.out.println("Can it fly :"+bird.isCanFly());
    }
}
