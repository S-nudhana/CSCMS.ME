import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Morse_code2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + " ";
        char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String ch = "";
        int count = 0;
        
        for(int i = 0;i < str.length();i++){
            if(str.substring(i,i + 1).equals(" ")){
                for(int j = 0;j < s.length;j++){
                    if(ch.equals(s[j])){
                        System.out.print(c[j]);
                    }
                }
                ch = "";
            }else{
                ch += str.substring(i,i + 1);
            }
        }
    }
}
