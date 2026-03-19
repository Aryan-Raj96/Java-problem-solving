class Student {
    private String name;
    private String Rollno;

    void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

}

public class getersetter {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setname("Apna college");
        System.out.println(S1.getname());

    }

}
