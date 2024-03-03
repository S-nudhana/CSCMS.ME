import java.util.Scanner;

public class CSC102_Quiz2_2019_Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
      	String str = str1.toLowerCase();
        boolean ch = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) && i != j && str.charAt(i) != ' ' && str.charAt(i) != '-'){
                    ch = false;
                    break;
                }
            }
        }
        System.out.println(ch ? str1 + " is an isogram" : str1 + " is not an isogram");
    }
}
