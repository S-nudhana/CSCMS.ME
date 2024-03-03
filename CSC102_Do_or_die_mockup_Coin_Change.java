import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Coin_Change {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumA = m - n;
        int sumB = m - n;
        
        if(m < n){
            System.out.println("Not enough money.");
        }else if(n == m){
            System.out.println("No change for you.");
        }else{
            System.out.println("Change: " + sumA);
            sumA /= 1000;
            System.out.println("1000THB: " + sumA);
            sumB %= 1000;
            sumA = sumB / 500;
            System.out.println("500THB: " + sumA);
            sumB %= 500;
            sumA = sumB / 100;
            System.out.println("100THB: " + sumA);
            sumB %= 100;
            sumA = sumB / 50;
            System.out.println("50THB: " + sumA);
            sumB %= 50;
            sumA = sumB / 20;
            System.out.println("20THB: " + sumA);
            sumB %= 20;
            sumA = sumB / 10;
            System.out.println("10THB: " + sumA);
            sumB %= 10;
            sumA = sumB / 5;
            System.out.println("5THB: " + sumA);
            sumB %= 5;
            sumA = sumB / 2;
            System.out.println("2THB: " + sumA);
            sumB %= 2;
            sumA = sumB / 1;
            System.out.println("1THB: " + sumA);
            sumB %= 1;
        }
    }
}
