package week9;

import java.util.*;

public class Student {
    private String fn="";
    private String ln="";

    public String toString(){
        return "My first name "+this.fn+" last name "+this.ln;
    }

    public void keepFirstName(String fn){
        this.fn = fn;
    }

    public void keepLastName(String ln){
        this.ln = ln;
    }

    public static void main(String[] args) {
        Student st = new Student();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name :");
        st.keepFirstName(in.nextLine());
        System.out.print("Enter last name :");
        st.keepLastName(in.nextLine());

        System.out.println(st.toString());

        in.close();
    }
}
