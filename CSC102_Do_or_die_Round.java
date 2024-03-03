import java.util.Scanner;

public class CSC102_Do_or_die_Round {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        
        int result = (int)Math.round(n);
        if(result % 7 == 0 || result % 10 == 7){
            System.out.println("Unlucky");
        }else{
            System.out.println("Lucky");
        }
    }
}
