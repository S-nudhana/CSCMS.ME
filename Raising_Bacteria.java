import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;

        while(true){
            if(n == 1){
                break;
            }else if(n % 2 != 0){
                c++;
                n -= 1;
            }else if(n % 2 == 0){
                n /= 2;
            }
        }
        System.out.println(c);
    }
}