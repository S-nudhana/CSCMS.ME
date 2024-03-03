import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Full_name_Formal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String strA = str1.toLowerCase();
        String strB = str2.toLowerCase();
        
        System.out.println(strA.toUpperCase().charAt(0) + strA.substring(1) + " " + strB.toUpperCase().charAt(0) + strB.substring(1));
    }
}
