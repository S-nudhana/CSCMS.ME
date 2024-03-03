import java.util.Scanner;

public class BJ_POSN1_2022_Mock_exam_day_3_Max_contiguous_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = 0;j < m;j++){
                sum += arr[j];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
