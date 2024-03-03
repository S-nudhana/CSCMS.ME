import java.util.*;

public class BJ_POSN1_2022_Mock_day_2_Radius_Text2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i = 0;i < str.length();i++){
            for(int j = 0;j < str.length();j++){
                if(j < i){
                    System.out.print(str.charAt(i));
                }else{
                    System.out.print(str.charAt(j));   
                }
            }
            System.out.println();
        }
    }   
}