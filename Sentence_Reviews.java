import java.util.Scanner;
import java.util.Arrays;

public class Sentence_Reviews {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c;
        int ch = 0;
        long sum = 0;
        long res = 0;
        int[] arr = new int[str.length()];
        
        for(int i = 0;i < str.length();i++){
            c = str.charAt(i);
            ch = (int)c;
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                arr[i] = (int)c;
            }else{
                continue;
            }
        }
        
        Arrays.sort(arr);
        
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                if(j != i && arr[i] == arr[j]){
                    arr[j] = 0;
                }   
            }
        }
        
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        sum = sum * sum;
        sum %= str.length();
        if(sum < 0 || sum > 10){
            System.out.println("ERROR");
        }else{
            System.out.println(sum + "/10");   
        }
    }
}