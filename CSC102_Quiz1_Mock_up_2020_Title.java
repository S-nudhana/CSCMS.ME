import java.util.Scanner;

public class CSC102_Quiz1_Mock_up_2020_Title {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
    
        int s = str.length();
        if(s > n){
          System.out.print(str.substring(0,n) + "...");
        }else{
          System.out.print(str);
        }
      }
}
