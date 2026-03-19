public class problem {
    public static void main(String[] args) {
        int marks[] = { 100, 95, 85, 21, 17, 71, 36, 35, 7 };

        int n = marks.length;
        for (int i = 0; i < n; i++) {
            if (marks[i] < 35) {
                System.out.print(marks[i]);
            }
        }
    }

}
