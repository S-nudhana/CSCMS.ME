import java.util.Scanner;

public class CSC102_Quiz2_2019_Text_inside_out {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strL = str.length();
        
        if(strL % 2 == 0){
            for(int i = (strL / 2) - 1;i >= 0;i--){
                System.out.print(str.charAt(i));
            }
            for(int j = strL - 1;j >= strL / 2;j--){
                System.out.print(str.charAt(j));
            }
        }else{
            for(int i = (strL / 2) - 1;i >= 0;i--){
                System.out.print(str.charAt(i));
            }
            System.out.print(str.charAt(strL / 2));
            for(int j = strL - 1;j > strL / 2;j--){
                System.out.print(str.charAt(j));
            }
        }
    }
}