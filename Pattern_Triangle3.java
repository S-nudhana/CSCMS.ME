import java.util.Scanner;

public class Pattern_Triangle3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                String res = (j >= m - 1) ? "*" : "-" ;
                System.out.print(res);
            }
            System.out.println("");
            m--;
        }
    }
}