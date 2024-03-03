import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String sym = sc.next();
        int B = sc.nextInt();
        int sum;
        
        switch(sym){
            case "+":
                sum = A + B;
                System.out.println(sum);
                break;
            case "-":
                sum = A - B;
                System.out.println(sum);
                break;
            case "*":
                sum = A * B;
                System.out.println(sum);
                break;
            case "/":
                if(B == 0){
                    System.out.println("error");
                }else{
                    sum = A / B;
                    System.out.println(sum);
                }
                break;
            case "%":
            	if(B == 0){
                    System.out.println("error");
                }else{
                    sum = A % B;
                    System.out.println(sum);
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}