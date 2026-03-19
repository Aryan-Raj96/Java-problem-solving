class Students {
    String name;
    private int rollno = 34;
    double CGPA;

    private void print() {
        System.out.println(name + " " + rollno + " " + CGPA);
    }

    void p() {
        print();
    }
}

public class privatee {
    public static void main(String[] args) {
        Students s1 = new Students();
        // s1.rollno=34;
        s1.p();
        s1.name = "Shardha";
        s1.CGPA = 9;
        s1.p();

        Students s2 = new Students();
        s2.p();

    }

}
