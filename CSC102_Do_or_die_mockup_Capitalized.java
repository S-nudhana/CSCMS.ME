import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Capitalized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = up(str);
        System.out.println(res);
    }

    public static String up(String str) {
        if(str.equals("")) {
            return "";
        }else{
            char fc = str.charAt(0);
            if(Character.isUpperCase(fc)) {
                return fc + up(str.substring(1));
            }else{
                return up(str.substring(1));
            }
        }
    }
}