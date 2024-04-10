
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); 
        
		int[] Score = new int[N];
		 
        for (int i = 0; i < N; i++) {
        	Score[i] = scanner.nextInt();
               
        }

        int maxScore = 0;
        for(int j : Score) {
        	if(j>maxScore) {
        		maxScore = j;
        	}
        }
        
        double newSum = 0;
        for (int k : Score) {
            newSum += (double) k / maxScore * 100;
        }
        
        double newAverage = newSum / N;
        
        System.out.println(newAverage);
        
        scanner.close();
    }

}