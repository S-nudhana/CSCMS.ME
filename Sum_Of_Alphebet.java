import java.util.Scanner;

public class Sum_Of_Alphebet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int strL = str.length();
        char[] strA = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int sum = 0;
        
        for(int i = 0;i < strL;i++){
            for(int j = 0;j < strA.length;j++){
                if(str.charAt(i) == strA[j]){
                    sum += (j + 1) - i;
                    break;
                }else{
                    continue;
                }   
            }
        }
        System.out.println(sum);
    }
}