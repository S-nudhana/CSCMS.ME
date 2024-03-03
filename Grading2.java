import java.util.Scanner;
import java.util.Arrays;

public class Grading2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrS = new int[n];
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        arrS = arr.clone();
        Arrays.sort(arrS);
        
        double perA = (90 * (n + 1.0)) / 100;
        double perB = (70 * (n + 1.0)) / 100;
        double perC = (50 * (n + 1.0)) / 100;
        double perD = (30 * (n + 1.0)) / 100;
        double perE = (10 * (n + 1.0)) / 100;
        
        if (perA == (int) perA){
            perA = (int) perA - 1;            
        } else {
            perA = (int) perA;
        }
        if (perB == (int) perB){
            perB = (int) perB - 1;            
        } else {
            perB = (int) perB;
        }
        if (perC == (int) perC){
            perC = (int) perC - 1;            
        } else {
            perC = (int) perC;
        }
        if (perD == (int) perD){
            perD = (int) perD - 1;            
        } else {
            perD = (int) perD;
        }
        if (perE == (int) perE){
            perE = (int) perE - 1;            
        } else {
            perE = (int) perE;
        }
        
        int a, b, c, d, e;
        a = arrS[(int) perA];
        b = arrS[(int)perB];
        c = arrS[(int)perC];
        d = arrS[(int)perD];
        e = arrS[(int)perE];
        
        for(int i = 0;i < n;i++){
            if(arr[i] >= a){
                System.out.print("A");
            }else if(arr[i] >= b){
                System.out.print("B");
            }else if(arr[i] >= c){
                System.out.print("C");
            }else if(arr[i] >= d){
                System.out.print("D");
            }else if(arr[i] >= e){
                System.out.print("E");
            }else{
                System.out.print("F");
            }
            System.out.print(" ");
        }
    }   
}