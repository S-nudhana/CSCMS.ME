import java.util.Scanner;

public class CSC102_Quiz1_2019_Weapon_factory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sw = 0;
        int sh = 0;
        int he = 0;
        
        while(true){
            if(n >= 10){
                n -= 10;
                sw++;
            }
            if(n >= 8){
                n -= 8;
                sh++;
            }
            if(n >= 3){
                n -= 3;
                he++;
            }
            if(n < 3){
                break;
            }
        }
        System.out.print(sw + " " + sh + " " + he + " " + n);
    }
}