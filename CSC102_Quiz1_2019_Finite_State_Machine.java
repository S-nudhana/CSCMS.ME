import java.util.Scanner;

public class CSC102_Quiz1_2019_Finite_State_Machine{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String a = sc.next();
        String b = sc.next();
        
        switch(n){
            case "0 0":
                if(a.equals("-") && b.equals("-")){
                    System.out.println("NEUTRAL");
                }else if(a.equals("1") && b.equals("-")){
                    System.out.println("MuR");
                }else{
                    System.out.println("DnD");
                }
                break;
            case "0 1":
                if(a.equals("-") && b.equals("-")){
                    System.out.println("DnD");
                }else if(a.equals("1") && b.equals("-")){
                    System.out.println("MuR");
                }else{
                    System.out.println("NEUTRAL");
                }
                break;
            case "1 0":
                if(a.equals("-") && b.equals("-")){
                    System.out.println("MuR");
                }else if(a.equals("1") && b.equals("-")){
                    System.out.println("NEUTRAL");
                }else{
                    System.out.println("DnD");
                }
                break;
        }
    }
}