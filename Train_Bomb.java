import java.util.Scanner;

public class Train_Bomb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int b = sc.nextInt();

        if((t == 1 && t == b)||(t <= 3 && t == b + 1)){
            System.out.println("DIE");
        }else{
            for(int i = 1;i <= t;i++){
                if(i == b || i == b - 1 || i == b + 1){
                    System.out.print("");
                }else{
                    System.out.print(i + " ");
                }
            }
        }
    }
}
