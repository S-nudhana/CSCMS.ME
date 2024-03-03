import java.util.Scanner;

public class BJ_POSN1_2022_Mock_exam_day_1_RadiusText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() % 2 == 0){
            System.out.println("ERROR");
        }else{
            char[] arr = new char[(str.length() * 2) - 1];
            int n = str.length() - 2;
            for(int i = 0;i < (str.length() * 2) - 1;i++){
                if(i < str.length()){
                    arr[i] = str.charAt(i);
                }else{
                    arr[i] = str.charAt(n);
                    n--;
                }
            }
            int a = 0;
            int b = arr.length - 1;
            int c = str.length() - 2;
            int d = str.length();
            for(int i = 0;i < str.length();i++){
                for(int j = 0;j < str.length() * 2 - 1;j++){
                    if(a < j && j < str.length()){
                        System.out.print(arr[a]);
                    }else if(j < b && j >= str.length()){
                        System.out.print(arr[b]);
                    }else{
                        System.out.print(arr[j]);
                    }
                }
                a++;
                b--;
                System.out.println();
            }
             for(int i = 0;i < str.length() - 1;i++){
                for(int j = 0;j < str.length() * 2 - 1;j++){
                    if(c < j && j <= str.length()){
                        System.out.print(arr[c]);
                    }else if(j < d && j > str.length()){
                        System.out.print(arr[d]);
                    }else{
                        System.out.print(arr[j]);
                    }
                }
                d++;
                c--;
                System.out.println();
            }
        }
    }
}