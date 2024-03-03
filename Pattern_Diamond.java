import java.util.Scanner;

public class Pattern_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        int z = (2 * n) - 1;
        int start1 = z / 2,end1 = (z - start1) + 1;
        int start2 = 1,end2 = z;
        
        for(short i = 1;i <= z;i++){
        if(i <= z / 2){
            for(short l = 1;l <= z;l++){
            if(start1 < l && l < end1){
                System.out.print("*");
            }else{
                System.out.print("-");
            }
            }
            start1 -= 1;
            end1 += 1;
        }else if(i == n){
            for(short o = 1;o <= z;o++){
            System.out.print("*");
            }
        }else{
            for(short t = 1;t <= z;t++){
            if(start2 < t && t < end2){
                System.out.print("*");
            }else{
                System.out.print("-");
            }
            }
            start2 += 1;
            end2 -= 1;
        }
        System.out.println();
        }
    }
}