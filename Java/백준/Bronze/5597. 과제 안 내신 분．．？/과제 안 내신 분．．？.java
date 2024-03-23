import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> submittedStudents = new HashSet<>(); //HashSet은 고유한 값만 저장해줍니다.

        for (int i = 0; i < 28; i++) {
            int submittedStudent = scanner.nextInt();
            submittedStudents.add(submittedStudent);
        }

        for (int i = 1; i <= 30; i++) {
            if (!submittedStudents.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
