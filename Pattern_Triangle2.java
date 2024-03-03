import java.util.Scanner;

public class Pattern_Triangle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a;

        for(int i = 1;i <= a;i++){
            for(int j = 1;j <= x;j++){
                System.out.print("*");
            }
            System.out.println("");
            x -= 1;
        }
    }
}