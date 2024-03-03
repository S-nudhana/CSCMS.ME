import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0 || n == 1){
            System.out.println("No");
        }else{
            boolean ck = true;
            for(int i = 2;i <= n;i++){
                if(n % i == 0){
                    ck = false;
                    System.out.println("No");
                    break;
                }
            }
            if(ck){
                System.out.println("Yes");
            }
        }
    }
}