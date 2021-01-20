public class Circle {
    //add attribute
    private int radius;
    private double pi = 3.141592653589793;
    private int id = 0;
    private int x;
    private int y;

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public void setX(int indexX) {
        this.x = indexX;
    }

    public void setY(int indexY) {
        this.y = indexY;
    }

    public void setRadius(int radiuss) {
        this.radius = radiuss;
    }

    public double findArea() {
        if (this.radius <= 0) {
            return 0;
        } else {
            return this.pi * this.radius * this.radius;
        }

    }

    public double findCircumference() {
        if (this.radius <= 0) {
            return 0;
        } else {
            return this.pi * 2 * this.radius;
        }
        
    }

    public boolean circle(int x2, int y2, int r2) { 
        int distSq = (this.x - x2) * (this.x - x2) + 
                     (this.y - y2) * (this.y - y2); 
        int radSumSq = (this.radius + r2) * (this.radius + r2); 
        if (distSq < radSumSq){
            return true;
        }else{
            return false;
        } 
    } 

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setId(1);
        c1.setRadius(2);
        c1.setX(0);
        c1.setY(0);
        System.out.println("Area of Circle"+c1.getId()+" = " + c1.findArea());
        System.out.println("Circumferrene of Circle"+c1.getId()+" = " +c1.findCircumference());

        Circle c2 = new Circle();
        c2.setId(2);
        c2.setRadius(3);
        c2.setX(1);
        c2.setY(2);
        System.out.println("Area of Circle"+c2.getId()+" = " + c2.findArea());
        System.out.println("Circumferrene of Circle"+c2.getId()+" = " +c2.findCircumference());
    
        Circle c3 = new Circle();
        c3.setId(3);
        c3.setRadius(1);
        c3.setX(3);
        c3.setY(5);
        System.out.println("Area of Circle"+c3.getId()+" = " + c3.findArea());
        System.out.println("Circumferrene of Circle"+c3.getId()+" = " +c3.findCircumference());
    
        Circle c4 = new Circle();
        c4.setId(4);
        c4.setRadius(-1);
        c4.setX(-1);
        c4.setY(-10);
        System.out.println("Area of Circle"+c4.getId()+" = " + c4.findArea());
        System.out.println("Circumferrene of Circle"+c4.getId()+" = " +c4.findCircumference());
    
        System.out.println("Is Circle"+c1.getId()+" intersec Circle"+c2.getId()+" : "+c1.circle(1, 2, 3));
        System.out.println("Is Circle"+c1.getId()+" intersec Circle"+c3.getId()+" : "+c1.circle(3, 5, 1));
        
    }
}