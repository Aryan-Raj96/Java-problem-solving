class Student {
    String Name;
    int rollno;
    int[] marks;

    Student(int size) {
        int marks[] = new int[size];
    }

    public class constructorarray {
        public static void main(String[] args) {
            Student s1 = new Student(5);
        }
    }
}