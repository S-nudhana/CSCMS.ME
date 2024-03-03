import java.util.Scanner;

public class CSC102_Quiz1_2019_Minutes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = m / 525600;
        int y = (m % 525600) / 1440;
        
        System.out.println(y + " " + d);
    }
}
