import java.util.Scanner;

public class BJ_POSN1_2022_Mock_exam_day_2_Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        int sumMax = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int c = 0; c < m; c++) {
            for (int i = 0; i < n; i++) {
                if (count < 1) {
                    for (int j = 0; j < m; j++) {
                        sum += arr[i][j];
                        if (j == m - 1) {
                            count = 1;
                        }
                    }
                } else {
                    sum += arr[i][c];
                }
            }
            count = 0;
            if (c == 0) {
                sumMax = sum;
            } else {
                if (sum >= sumMax) {
                    sumMax = sum;
                }
            }
            sum = 0;
        }
        System.out.println(sumMax);
    }
}