// class Student {
//     String Name;
//     int rollno;
//     double CGPA;
//     int height;

//     void call() {
//         System.out.println(Name + " " + rollno + " " + CGPA + " " + height);
//     }
// }
import java.util.*;

public class Children {
    class Student {
        String Name;
        int rollno;
        double CGPA;
        int height;

        void Student() {
            System.out.println(Name + " " + rollno + " " + CGPA + " " + height);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "raghav";
        s1.rollno = 23;
        s1.CGPA = 9.5;
        s1.height = 170;

        Student s2 = new Student();
        s2.Name = "raj";
        s2.rollno = 22;
        s2.CGPA = 9;
        s2.height = 175;

        Student s3 = new Student();
        s3.Name = "ragha";
        s3.rollno = 2;
        s3.CGPA = 5;
        s3.height = 180;

        s1.Student();
        s2.Student();
        s3.Student();
    }
}