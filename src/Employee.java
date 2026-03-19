public class Employee {

    int memberVariable; // instance variable
    static int staticVariable = 100; // static variable

    Employee() { // default constructor
    }

    Employee(int a) { // parameterized constructor
    }

    public void dummyMethod() {
        byte localVariable = 100; // local variable
        System.out.println(localVariable);
    }

    public int dummyMethod2(int a, int b) { // method parameters
        return a + b;
    }
}