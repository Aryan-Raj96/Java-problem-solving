class Student {
    String Name;
    int Rollno;

    Student(String Name, int Rollno) {
        this.Name = Name;
        this.Rollno = Rollno;

    }

    Student(int Rollno, String Name) {
        this.Name = Name;
        this.Rollno = Rollno;

    }

    void print() {
        System.out.println(Rollno + " " + Name);
    }
}

public class thisss {
    public static void main(String[] args) {
        Student S1 = new Student("khAPRA", 78);
        S1.Name = "Shradha";
        S1.Rollno = 23;
        Student S2 = new Student(90, "Aman dhatterwal");
        S1.print();
        S2.Name = "Aman Bahiya";
        S2.Rollno = 12;
        S2.print();
    }

}
