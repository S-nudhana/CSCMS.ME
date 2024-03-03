import java.util.Arrays;
import java.util.Scanner;

public class Happy_new_year_2020_Pair_of_Happiness {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            boolean found = false;
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == num && arr[left] != arr[right]) {
                    found = true;
                    break;
                } else if (sum < num) {
                    left++;
                } else {
                    right--;
                }
            }

            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
