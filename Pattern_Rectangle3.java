import java.util.Scanner;

public class Pattern_Rectangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int r = 1; r <= n; r++) {
                if (i == 1 || i == n) {
                    if (r == 1 || r == n) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
