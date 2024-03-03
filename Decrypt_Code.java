import java.util.Scanner;

public class Decrypt_Code {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String ch = "";
        int sum = 0;
        int ck = 0;
        int ans = 0;
        
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                if(i == str.length() - 1){
                    ch += String.valueOf(str.charAt(i));
                    sum += Integer.parseInt(ch);
                }else{
                    ch += String.valueOf(str.charAt(i));
                }
            }else{
                if(ch != ""){
                    sum += Integer.parseInt(ch);
                    ch = "";
                }
                sum += str.charAt(i) - 64;
            }
        }
        
        for(int i = 2;i <= sum;i++){
            ck = 0;
            if(sum % i == 0){
                for(int j = 2;j <= i;j++){
                    if(i % j == 0){
                        ck++;
                    }
                }
                if(ck == 1){
                    ans += i;
                }
            }
        }
        
        System.out.println(ans);
    }
}