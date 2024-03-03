import java.util.Scanner;

public class Where_R_U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase() + " ";
        String ch = sc.nextLine().toLowerCase();
        int count = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(ch)) {
                count++;
                if(count <= 1){
                    ans += Integer.toString(i);
                }else{
                    ans += ", " + Integer.toString(i);
                }
            }
        }
        if(count == 0){
            System.out.println("ERROR");
        }else{
            System.out.println(count);
            System.out.println(ans);
        }
    }
}