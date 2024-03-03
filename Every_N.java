import java.util.Scanner;

public class Every_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < str.length(); i += n) {
            System.out.print(str.charAt(i));
        }
    }
}