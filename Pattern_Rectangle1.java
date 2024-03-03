import java.util.Scanner;

public class Pattern_Rectangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int c = 0; c < n; c++){
            for(int r = 0; r < n - 1; r++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}