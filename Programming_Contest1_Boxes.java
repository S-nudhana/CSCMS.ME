import java.util.Scanner;
import java.util.Arrays;


public class Programming_Contest1_Boxes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] b1 = new int[3];
        int[] b2 = new int[3];
        int count = 0;
        
        for(int i = 0;i < 3;i++){
            b1[i] = sc.nextInt();
        }
        for(int i = 0;i < 3;i++){
            b2[i] = sc.nextInt();
        }
        
        Arrays.sort(b1);
        Arrays.sort(b2);
        
        for(int i = 0;i < 3;i++){
            if(b1[i] > b2[i]){
                count = 1;
            }
        }
        if(count == 1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
