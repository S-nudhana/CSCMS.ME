import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Sum_Digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sum(str));
    }
    public static int sum(String str){
        if(str.length() == 0){
            return 0;
        }
        return (int)str.charAt(str.length() - 1) - 48 + sum(str.substring(0, str.length() - 1));
    }
}
