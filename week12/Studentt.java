package week12;

public class Studentt {
    String name;
    int age;
    double gpa;

    public String getStudentName(){
        return name;
    }

    public int getStudentAge(){
        return age;
    }

    public double getStudentGPA(){
        return gpa;
    }

    public boolean equalsName(Object ojb){
        if(ojb == null){
            return false;
        }else if(ojb == this){
            return true;
        }
        return this.getStudentName() == ((Studentt )ojb).getStudentName();
    }

    public boolean equalsAge(Object ojb){
        if(ojb == null){
            return false;
        }else if(ojb == this){
            return true;
        }
        return this.getStudentAge() == ((Studentt )ojb).getStudentAge();
    }

    public boolean equalsGPA(Object ojb){
        if(ojb == null){
            return false;
        }else if(ojb == this){
            return true;
        }
        return this.getStudentGPA() == ((Studentt )ojb).getStudentGPA();
    }

    public Studentt(String name,int age,double d){
        this.name = name;
        this.age = age;
        this.gpa=d;
    }
}
