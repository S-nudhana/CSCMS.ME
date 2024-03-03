import java.util.Scanner;

public class Overlapped_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        
        for(int i = 0; i < 3;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < 3;i++){
            arr2[i] = sc.nextInt();
        }
        
        int x = ((arr1[0] - arr2[0]) * (arr1[0] - arr2[0])) + ((arr1[1] - arr2[1]) * (arr1[1] - arr2[1]));
        double d = Math.sqrt(x);
        double a = (arr1[2] - arr2[2]) * 3.14;
        
        if(d > arr1[2] + arr2[2]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
