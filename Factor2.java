import java.util.Scanner;

public class Factor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int j = 0;j < m;j++){
            int n = sc.nextInt();
            int sqrt = (int) Math.sqrt(n);
            long count = 0;
            for(int i = 1;i <= sqrt;i++){
                if(n % i == 0){
                    count += 2;
                }
            }
            if (sqrt * sqrt == n) {
                count--;
            }
            System.out.print(count + " ");
        }
    }
}