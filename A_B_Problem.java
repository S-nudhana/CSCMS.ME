import java.util.Scanner;

public class A_B_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ans = "";
        int x = 0;

        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            int A = Character.getNumericValue(a.charAt(i));
            int B = (i >= b.length()) ? 0 : Character.getNumericValue(b.charAt(i));
            int C = 0;
            if (x > 0) {
                A += x;
                x = 0;
            }
            if (A + B >= 10) {
                C = (A + B) % 10;
                x = 1;
            } else {
                C = A + B;
            }
            ans = C + ans; // Corrected this line
        }

        if (x > 0) {
            ans = x + ans;
        }

        System.out.println(ans);
    }
}
