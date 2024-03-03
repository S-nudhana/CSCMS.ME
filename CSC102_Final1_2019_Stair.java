import java.util.Scanner;

public class CSC102_Final1_2019_Stair {
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(get(n));
        }
        public static int get(int n){
            if(n == 1){
                return 1;
            }
            if(n < 1){
                return 0;
            }

            return get(n - 1) + get(n - 2);
        }
    }
}
