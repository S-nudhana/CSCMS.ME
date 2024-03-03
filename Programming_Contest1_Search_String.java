import java.util.Scanner;

public class Programming_Contest1_Search_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
    
        String strA = str1.toLowerCase();
        String strB = str2.toLowerCase();
    
        int s1 = str1.length();
    
        String front = strA.substring(0,s1 / 2);
        String back = strA.substring((s1 / 2) + 1,s1);
    
        if(strA.contains(strB) == true){
            if(strA.equals(strB) || (front.contains(strB) && back.contains(strB))){
                System.out.println("Front,Back");
            }else if(front.contains(strB)){
                System.out.println("Front");
            }else{
                System.out.println("Back");
            }
        }else{
            System.out.println("No");
        }
    }
}
