import java.util.Scanner;

public class BJ_POSN1_2022_Mock_exam_day_1_stock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 1;
        for(int i = 0;i < n;i++){
            if(i < (n - 1) && arr[i] < arr[i + 1]){
                count++;
            }else if(i == n && arr[i - 1] < arr[i]){
                count++;
            }else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }   
        System.out.println(max);
    }
}
