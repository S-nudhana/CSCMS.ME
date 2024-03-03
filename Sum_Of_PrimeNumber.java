import java.util.Scanner;

public class Sum_Of_PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int MIN,MAX;
        int sum = 0;
        int prime = 0;

        if(n1 > n2){
            MIN = n2;
            MAX = n1;
        }else{
            MIN = n1;
            MAX = n2;
        }
       
        for(int i = MIN;i < MAX;i++){
            for(int x = 2;x < i ;x++){
                if(i % x == 0){
                    prime = 1;
                    break;
                }
            }
            if(prime == 1)
            {
                prime = 0;
            }
            else if(prime == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}