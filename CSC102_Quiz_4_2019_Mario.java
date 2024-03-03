import java.util.Scanner;

public class CSC102_Quiz_4_2019_Mario {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= n;i++){
            if(i % 15 == 0){
                sum += i * 10;
            }
            else if(i % 5 == 0){
                sum += i* 3;
            }
            else if(i % 3 == 0){
                sum += i * 2;
            }else{
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
