import java.util.Scanner;

public class CSC102_Quiz1_Mock_up_2020_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x * ((n - y) / x) + y);
    }
}
