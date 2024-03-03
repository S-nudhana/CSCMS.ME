import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 1;i <= n + 1;i++){
            for(int j = 1;j <= (2 * m ) + 1;j++){
                if(i == 1){
                    if(j % 2 == 0){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                    if(j == (2 * m ) + 1){
                        System.out.println("");
                    }
                }else{
                    if(j % 2 == 0){
                        System.out.print("_");
                    }else{
                        System.out.print("|");
                    }
                    if(j == (2 * m ) + 1){
                        System.out.println("");
                    }
                }
            }
        }
    }
}
