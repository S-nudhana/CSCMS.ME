import java.util.Scanner;

public class Pattern_Kmutt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = (3 * n) + 1;
        
        for(int i = 1; i <= num;i++){
            for(int j = 1;j <= num;j++){
                if((i <= (2 * n) + 1 && j == n + 1) || (i == n + 1 && j <= (2 * n) + 1) || (i == (2 * n) + 1 && j > n) || (i >= (2 * n) - (i - 1) && j == (2 * n) + 1)){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}