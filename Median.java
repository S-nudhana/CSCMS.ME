import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println(a);
        } else if ((a < b && b < c) || (c < b && b < a)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}