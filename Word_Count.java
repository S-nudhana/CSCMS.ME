import java.util.Scanner;

public class Word_Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        String ch = "";
        int ans = 0;
        
        for(int i = 0;i < str1.length();i++){
            ch += str1.substring(i,i + 1);
            if(ch.contains(str2)){
                ans += 1;
                ch = "";
            }
        }
        System.out.println(ans);
    }
}
