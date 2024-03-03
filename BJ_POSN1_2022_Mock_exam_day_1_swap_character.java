import java.util.Scanner;

public class BJ_POSN1_2022_Mock_exam_day_1_swap_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = new String[str.length()];
        
        for(int i = 0;i < str.length();i++){
            arr[i] = str.substring(i,i + 1);
        }
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a >= 0 && b >= 0 && a < str.length() && b < str.length()){
                String temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;   
            }
        }
        for(int i = 0;i < str.length();i++){
            System.out.print(arr[i]);
        }
    }
}
