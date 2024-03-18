import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); //바구니 개수 N
        int M = scanner.nextInt(); //바꿀 횟수 M 입력
        
        int[] baskets = new int[N];
        for(int i = 0; i<N; i++){
            baskets[i] = i+1;
        }
        
        for(int j = 0; j < M; j++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int indexA = a - 1 ;
            int indexB = b - 1 ;
            
            int temp = baskets[indexA];
            baskets[indexA] = baskets[indexB];
            baskets[indexB] = temp;
        }
        
        for(int k = 0; k < N; k++){
            System.out.print(baskets[k] + " ");
        }
    }
}