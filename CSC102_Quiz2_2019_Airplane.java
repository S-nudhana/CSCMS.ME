import java.util.Scanner;

public class CSC102_Quiz2_2019_Airplane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int countL  = 0;
        int countR = 0;

        for(int round = 0;round < n * 2;round++){
            int m = sc.nextInt();
            int minL = 100;
            int minR = 100;
            int sumL = 0;
            int sumR = 0;
            for(int i = 0;i < n;i++){
                sumL += arr[i][0];
                sumR += arr[i][1];
                if(arr[i][0] < minL){
                    minL = arr[i][0];
                }
                if(arr[i][1] < minR){
                    minR = arr[i][1];
                }
            }
            if(sumL < sumR || sumL == sumR){
                if(countL == n){
                    for(int i = n - 1;i >= 0;i--){
                        if(minL == arr[i][0]){
                            arr[countR][1] = arr[i][0];
                            arr[i][0] = m;
                            countR += 1;
                            break;
                        }
                    }
                }else{
                    arr[countL][0] = m;
                    countL += 1;
                }
            }else{
                if(countR == n){
                    for(int i = n - 1;i >= 0;i--){
                        if(minR == arr[i][1]){
                            arr[countL][0] = arr[i][1];
                            arr[i][1] = m;
                            countL += 1;
                            break;
                        }
                    }
                }else{
                    arr[countR][1] = m;
                    countR += 1;
                }
            }
        }

        for(int i = 0;i < n;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
