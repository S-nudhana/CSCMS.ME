import java.util.Scanner;
import java.util.Arrays;

public class CSC102_Do_or_die_Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] arr = new String[n];
    
        for(int i = 0;i < n;i++){
            arr[i] = sc.next();
        }
    
        for(int x = 0;x < n;x++){
            StringBuilder reverse = new StringBuilder(arr[x]);
            reverse.reverse();
            String res = reverse.toString().toLowerCase();
            System.out.print(res.substring(0,1).toUpperCase() + res.substring(1) + " ");
        }
    }
}
