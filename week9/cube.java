package week9;

public class cube extends rectangle{
    int lenght;

    public cube(int lenght){
        this.lenght = lenght;
    }

    public String toString(){
        return "this is a cube with the side of "+lenght;
    }

    public static void main(String[] args) {
        cube c = new cube(55);
        System.out.println(c.toString());
    }
}
