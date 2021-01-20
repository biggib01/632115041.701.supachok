package week6;

public class Example {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, "Male");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        System.out.println();

        Engineer engi = new Engineer("Bright", 18, "Male");

        engi.genre = "Software Engineer";
        engi.introduce();
        engi.doJob();
        System.out.println();

        Doctor doc = new Doctor("Nam", 19, "Female");

        doc.genre = "Surgical doctor";
        doc.introduce();
        doc.heal();
        System.out.println();

        Student stu = new Student("Mos", 16, "Male");

        stu.studyProgramme = " Mathematics-Science Programme";
        stu.introduce();
        stu.study();
        System.out.println();

        Teacher tec = new Teacher("Minny", 22, "Female");

        tec.locationOfUni = "CMU";
        tec.introduce();
        tec.teachingAt();
        System.out.println();
    }
}
