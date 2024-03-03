import java.util.Scanner;

public class CSC102_Quiz4_2019_Neon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int arrL = 0;

        for(int i = 0;i < n;i++){
            arr[i] = sc.next();
        }
        
        if(n == 1){
            for(int i = 0;i < arr[0].length();i++){
                System.out.println(arr[0].charAt(i) + " ");
            }
        }else{
            for(int i = 0;i < n;i++){
                if(i == 0){
                    if(arr[i].length() > arr[i + 1].length()){
                        arrL = arr[i].length();              
                    }else{
                        arrL = arr[i + 1].length();
                    }
                }else{
                    if(arrL > arr[i].length()){
                        continue;
                    }else{
                        arrL = arr[i].length();
                    }
                }
            }
            
            for(int i = 0;i < arrL;i++){
                for(int j = 0;j < n;j++){
                    if(arr[j].length() > i){
                        System.out.print(arr[j].charAt(i));
                        if(j < n){
                            System.out.print(" ");
                        }
                    }else{
                        System.out.print(" ");
                        if(j < n){
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
