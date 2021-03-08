package week9;

public class rectangle extends shape {
    int width;
    int height;

    public void set(int width, int height){
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "this is a rectangle with width as "+width+" and the height as "+height;
    }
    
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.set(20,16);
        System.out.println(r.toString());
    }
}
