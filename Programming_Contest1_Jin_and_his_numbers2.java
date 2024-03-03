import java.util.Scanner;

public class Programming_Contest1_Jin_and_his_numbers2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i < n;i++){
            long n1 = sc.nextInt();
            long n2 = sc.nextInt();
            long sum = 0;
            if(n1 == n2){
                System.out.println(n1);
            }else{
                sum = ((n1 + n2) * ((n2 - n1) + 1)) / 2;
                System.out.println(sum);
            }
        }
    }
}
