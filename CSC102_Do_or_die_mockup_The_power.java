import java.util.Scanner;

public class CSC102_Do_or_die_mockup_The_power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 1;
        
        for(int i = 1;i <= m;i++){
            sum *= n;
        }
        System.out.println(sum);
    }
}
