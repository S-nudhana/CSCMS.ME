import java.util.Scanner;

public class CSC102_Quiz4_2019_RNA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strL = str.length();
        int Leu = 0, Pro = 0, His = 0, Gln = 0, Arg = 0;
        
        for(int i = 0;i < strL;i += 3){
            if(str.substring(i,i + 3).contains("CUU") || str.substring(i,i + 3).contains("CUC") || str.substring(i,i + 3).contains("CUA") || str.substring(i,i + 3).contains("CUG")){
                Leu += 1;
            }else if(str.substring(i,i + 3).contains("CCU") || str.substring(i,i + 3).contains("CCC") || str.substring(i,i + 3).contains("CCA") || str.substring(i,i + 3).contains("CCG")){
                Pro += 1;
            }else if(str.substring(i,i + 3).contains("CAU") || str.substring(i,i + 3).contains("CAC")){
                His += 1;
            }else if(str.substring(i,i + 3).contains("CAA") || str.substring(i,i + 3).contains("CAG")){
                Gln += 1;
            }else if(str.substring(i,i + 3).contains("CGU") || str.substring(i,i + 3).contains("CGC") || str.substring(i,i + 3).contains("CGA") || str.substring(i,i + 3).contains("CGG")){
                Arg += 1;
            }
        }
        System.out.print(Leu + " " + Pro + " " + His + " " + Gln + " " + Arg);
    }
}