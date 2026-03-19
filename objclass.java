
import java.util.*;

class student {
    String name;
    int rollno;
    double CGPA;
}

public class objclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();// declaration
        s1.name = "raj";
        s1.rollno = 1;
        s1.CGPA = 8;

        student s2 = new student();
        s2.name = "kahpra";
        s2.rollno = 2;
        s2.CGPA = 2.1;

        student s3 = new student();
        s3.name = "shardha";
        s3.rollno = sc.nextInt();
        s3.CGPA = 7.9;

        System.out.println(s1.name + "  " + s1.rollno + "   " + s1.CGPA + " " + s2.CGPA);
        s2.CGPA = 9.5;
        System.out.println(s2.CGPA);
        System.out.println(s3.rollno);

    }

}
