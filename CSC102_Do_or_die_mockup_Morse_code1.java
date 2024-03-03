import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Morse_code1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        
        for(int i = 0;i < str.length();i++){
            for(int j = 0;j < c.length;j++){
                if(str.charAt(i) == c[j]){
                    System.out.print(s[j]);
                }
            }
            System.out.print(" ");
        }
    }
}