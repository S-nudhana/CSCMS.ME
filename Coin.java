import java.util.Scanner;
import java.util.Arrays;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + " ";
        String[] num = str.split(" ");
        long[] arr = new long[num.length];
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(num[i]);   
        }
        
        int med = (arr.length / 2);
        Arrays.sort(arr);
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[med] - arr[i]);
        }
        System.out.println(sum);
    }
}