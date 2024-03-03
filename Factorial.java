import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long sum = 1;

        for (int i = 0; i < num; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}