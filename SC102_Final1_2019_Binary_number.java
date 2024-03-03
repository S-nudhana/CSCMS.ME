import java.util.Scanner;

public class SC102_Final1_2019_Binary_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getBinary(n));
    }
    public static String getBinary(int n){
        if(n == 1){
            return "1";
        }
        if(n == 0){
            return "0";
        }
        String str = Integer.toString(n % 2);
        n /= 2;
        return getBinary(n) + str;
    }
}
