package week7;

public class dog extends Pet {
    String size = "small";
    String hair = "long hair";

    void run(){
        System.out.println("My doggo wasn't want to run");
    }

    void bark(){
        System.out.println("She's "+size+" dog and she bark sound is small and cute.");
    }

    boolean isShortHair(){
        if("short hair" == hair){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        dog doggo = new dog();

        System.out.println("My doggo");
        doggo.showPetData("Mali", "Golden", "Brown", 3);
        doggo.run();
        doggo.bark();
        System.out.println("Short hair :"+doggo.isShortHair());
    }
}
