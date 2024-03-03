import java.util.Scanner;

public class Fibonacci_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(check(n,m));
    }
    public static int check(int n, int m){
        if(n == 1){
            if(m == 1){
                return 1;
            }else{
                return 0;
            }
        }
        if(n == 0){
            return 0;
        }
        int x = 0;
        if(n == m){
            x = 1;
        }
        return x + check(n - 1, m) + check(n - 2, m);
    }
}
