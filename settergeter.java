class Student {
    private String name;
    private String rollno;

    void setrollno(String rollno) {
        this.rollno = rollno;
    }

    String getrollno() {
        return rollno;
    }

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return name;
    }
}

public class settergeter {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setrollno("77");

        System.out.println(S1.getrollno());

        S1.setname("Shradha khapra");
        System.out.println(S1.getname());

    }

}
