package week12;

public class StudentData {
    
    public static void main(String[] args) {
        Studentt std01 = new Studentt("Mark",18,4.00);
        Studentt std02 = new Studentt("Jane",18,2.20);
        Studentt std03 = new Studentt("Peter",19,4.00);
        Studentt std04 = new Studentt("Mark",22,1.75);

        System.out.println("Name checking..");
        System.out.println(std01.equalsName(std02));
        System.out.println(std01.equalsName(std03));
        System.out.println(std02.equalsName(std04));
        System.out.println(std01.equalsName(std04));

        System.out.println("Age checking..");
        System.out.println(std01.equalsAge(std02));
        System.out.println(std03.equalsAge(std04));
        System.out.println(std01.equalsAge(std03));

        System.out.println("GPA checking..");
        System.out.println(std01.equalsGPA(std03));
        System.out.println(std02.equalsGPA(std04));
        System.out.println(std02.equalsGPA(std03));
    }
}
