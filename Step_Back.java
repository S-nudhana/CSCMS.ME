import java.util.Scanner;

public class Step_Back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int b = 1;
        if(m > n){
            int temp = n;
            n = m;
            m = temp;
        }
        for (int i = n; i >= m; i--) {
            int a = 0;
            for (int j = 0; j < b; j++) {
                System.out.print(n - a + " ");
                a++;
            }
            b++;
        }
    }
}