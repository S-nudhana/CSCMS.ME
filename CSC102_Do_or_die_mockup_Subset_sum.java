import java.util.Arrays;
import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Subset_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int X = scanner.nextInt();
            boolean existsSubset = false;
            for (int j = 0; j < (1 << N); j++) {
                int subsetSum = 0;
                for (int k = 0; k < N; k++) {
                    if ((j & (1 << k)) != 0) {
                        subsetSum += arr[k];
                    }
                }
                if (subsetSum == X) {
                    existsSubset = true;
                    break;
                }
            }
            System.out.println(existsSubset ? "Yes" : "No");
        }
    }
}