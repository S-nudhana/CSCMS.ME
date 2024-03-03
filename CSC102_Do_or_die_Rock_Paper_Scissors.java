import java.util.Scanner;

public class CSC102_Do_or_die_Rock_Paper_Scissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      String str1 = sc.next();
      String str2 = sc.next();
      String p1 = str1.toLowerCase();
      String p2 = str2.toLowerCase();
  
      if(p1.equals("rock")){
          if(p2.equals("paper")){
            System.out.println("Dr.Worarat Krathu");
          }else if(p1.equals(p2)){
            System.out.println("Draw");
          }else{
            System.out.println("Mr.Ukrit Ruckcharti");
          }
      }else if(p1.equals("paper")){
        if(p2.equals("scissors")){
            System.out.println("Dr.Worarat Krathu");
        }else if(p1.equals(p2)){
          System.out.println("Draw");
        }else{
            System.out.println("Mr.Ukrit Ruckcharti");
          }
      }else if(p1.equals("scissors")){
        if(p2.equals("rock")){
          System.out.println("Dr.Worarat Krathu");
        }else if(p1.equals(p2)){
        System.out.println("Draw");
        }else{
          System.out.println("Mr.Ukrit Ruckcharti");
        }
      }
    }
}