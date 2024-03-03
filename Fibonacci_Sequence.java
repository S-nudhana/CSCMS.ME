import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        if(1 <= n && n <= 20){
            if(n > 1){
                System.out.print(n1 + " ");
                System.out.print(n2 + " ");
                for(int i = 2;i < n;i++){
                    int n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(n3 + " ");
                }
            }else{
                System.out.println(n1 + " ");
            } 
        }
    }
}
