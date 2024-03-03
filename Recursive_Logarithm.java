import java.util.Scanner;

public class Recursive_Logarithm {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(log(a,b));
	}
    public static int log(int a, int b){
        double value = Math.log(a)/Math.log(b);
        int result = (int) value;
        return result;
     }
}
