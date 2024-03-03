import java.util.*;

public class Prime_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }

        if (count == 0 && n >= 2) {
            System.out.print(n);
        } else {
            for (int k = 2; k <= n; k++) {
                while (n % k == 0 && isPrime(k)) {
                    n /= k;
                    if (n == 1) {
                        System.out.print(k);
                    } else {
                        System.out.print(k + " x ");
                    }
                }
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}