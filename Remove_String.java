import java.util.Scanner;

public class Remove_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() > str2.length()){
            System.out.println(str1.replace(str2,""));
        }else{
            System.out.println(str2.replace(str1,""));
        }   
    }
}