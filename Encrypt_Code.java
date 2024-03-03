import java.util.Scanner;

public class Encrypt_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            boolean ch = false;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) && i != j){
                    ch = true;
                    break;
                }
            }
            if(ch){
                System.out.print("-");
            }else{
                System.out.print("*");
            }
        }
    }
}