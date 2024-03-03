import java.util.Scanner;

public class Grading1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if(n < 50 ){
            System.out.println("F");
        }else if(n < 60){
            System.out.println("D");
        }else if(n < 80){
            System.out.println("C");
        }else if(n < 90){
            System.out.println("B");
        }else if(n <= 100){
            System.out.println("A");
        }
    }    
}