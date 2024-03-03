import java.util.Scanner;
import java.util.Arrays;

public class CSC102_Do_or_die_mockup_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.length() == str2.length()) {
                char[] stra = new char[str1.length()];
                char[] strb = new char[str2.length()];
                for (int j = 0; j < stra.length; j++) {
                    stra[j] = str1.charAt(j);
                    strb[j] = str2.charAt(j);
                }
                Arrays.sort(stra);
                Arrays.sort(strb);
                boolean ch = true;
                for (int j = 0; j < stra.length; j++) {
                    if (stra[j] != strb[j]) {
                        ch = false;
                        break;
                    }
                }
                System.out.println(ch ? "Yes" : "No");
            } else {
                System.out.println("No");
            }
        }
    }
}