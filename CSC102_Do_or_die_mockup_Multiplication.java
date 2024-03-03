import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = mul(n,m);
        System.out.print(ans);
    }
    public static int mul(int n,int m){
        if(m == 0){
            return 0;
        }else if(m > 0){
            return n + mul(n, m - 1);
        }else{
            return -mul(n, -m);
        }
    }
}