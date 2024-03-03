import java.util.Scanner;

public class Hello_CS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.next();
            if((i + 1) % 2 == 0){
                int arrL = arr[i].length();
                for(int j = arrL - 1;j >= 0;j--){
                    System.out.print(arr[i].charAt(j));
                }
            }else{
                System.out.print(arr[i]);
                System.out.print(" ");
                continue;
            }
            System.out.print(" ");
        }
    }
}