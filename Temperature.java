import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double bF = (b * 9/5) + 32;
        
        if(a > bF){
            System.out.println("Higher");
        }else if(a == bF){
            System.out.println("Same");
        }else{
            System.out.println("Lower");
        }
    }
}
