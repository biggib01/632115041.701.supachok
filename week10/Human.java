package week10;

public class Human{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Human h = new Human();
        System.out.println("the first calling hit(Animal)");
        h.hit(dog);

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        h.hit(dog);

        dog = new fish();
        System.out.println("The third calling hit(Animal)");
        h.hit(dog);
    }
}
