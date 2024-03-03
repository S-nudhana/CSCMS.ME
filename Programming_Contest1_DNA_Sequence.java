import java.util.Scanner;

public class Programming_Contest1_DNA_Sequence {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stra = sc.nextLine();
        String strb = sc.nextLine();
        String x = "";
        int s = 0;
        int count = 0;
        
        for(int i = 0;i < strb.length();i++){
            if(strb.charAt(i) == 'A'){
                x += "T";
            }
            if(strb.charAt(i) == 'T'){
                x += "A";
            }
            if(strb.charAt(i) == 'C'){
                x += "G";
            }
            if(strb.charAt(i) == 'G'){
                x += "C";
            }
        }
        for(int i = 0;i < strb.length();i++){
            if(i > stra.length()){
                break;
            }else{
                for(int j = s;j < stra.length();j++){
                    s += 1;
                    if(x.charAt(i) == stra.charAt(j)){
                        count += 1;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
	}
}
