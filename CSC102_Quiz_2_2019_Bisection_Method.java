import java.util.*;

public class CSC102_Quiz_2_2019_Bisection_Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double torr = sc.nextDouble();
        double ch = (b - a) / 2.00;
        double x = 0.00;

        while(true){
            x = (a + b) / 2;
            double fa = c1 + c2 * (a - Math.sin(a));
            double fx = c1 + c2 * (x - Math.sin(x));
            if(fa * fx < 0){
                b = x;
            }else{
                a = x;
            }
            ch = (b - a) / 2.00; 
            if(ch < torr){
                break;
            }
        }
      	System.out.printf("%.06f",(a + b) / 2);
    }
}
