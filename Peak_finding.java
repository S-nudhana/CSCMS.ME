import java.util.Scanner;

public class Peak_finding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        String ans = "";

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        if(n == 1){
            count = 1;
        }else{
            if(arr[0] > arr[1]){
                count += 1;
            }            
        }

        for(int j = 1;j < n;j++){
            if(j < n - 1){
                if(arr[j] > arr[j - 1] && arr[j] > arr[j + 1]){
                    count += 1; 
                    ans += Integer.toString(arr[j]) + " ";
                }   
            }else{
                if(arr[j] > arr[j - 1]){
                    count += 1;
                    ans += Integer.toString(arr[j]) + " ";
                }
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
