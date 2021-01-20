package week7;

public class fish extends Pet{
    String size = "Small";
    String water = "Fresh water";
    int swimspeed = 100;

    void isSwimToTheSee(){
        System.out.println("My fish isn't swim to the see, he is like "+water);
    }

    void swimfast(){
        System.out.println("My fish was" +size+ ", and swim speed at " +swimspeed+" km/hr.");
    }

    public static void main(String[] args) {
        fish fish = new fish();

        System.out.println("My fish");
        fish.showPetData("Nemo", "Tuna (Bluefin)", "White", 2);
        fish.isSwimToTheSee();
        fish.swimfast();
    }
}
