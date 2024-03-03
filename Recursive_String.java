import java.util.Scanner;

public class Recursive_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = n;
        System.out.println(numString(n, count, num));
    }

    public static String numString(int n, int count, int num) {
        if(num == 1){
            return "1";
        }
        if(num == 2){
            return Integer.toString(num) + numString(n, count, num - 1) + Integer.toString(num);
        }
        if(count == num && num > 2){
            count = 1;
            num -= 1;
        }else{
            count++;
        }
        return Integer.toString(num) + numString(n, count, num) + Integer.toString(num);
    }
}