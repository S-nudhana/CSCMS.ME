import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        
        int strL = str.length();
        
        for(int i = 0;i < (strL / 2);i++){
            for(int j = strL - (i + 1);j > (strL / 2);j--){
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }else{
                    count = 1;
                    break;
                }
            }
        }
        if(count == 1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
