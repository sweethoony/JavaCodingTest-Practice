import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

         String S = scanner.nextLine();

         int i = scanner.nextInt();

         scanner.close();

         System.out.println(S.charAt(i - 1));
     }
 }