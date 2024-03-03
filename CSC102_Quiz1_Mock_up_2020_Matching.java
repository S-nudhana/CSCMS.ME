import java.util.Scanner;

public class CSC102_Quiz1_Mock_up_2020_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.equals(str2)) {
            System.out.println("Perfect Match");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Partial Match");
        } else if (str1.toLowerCase().contains(str2.toLowerCase()) || str2.toLowerCase().contains(str1.toLowerCase())) {
            System.out.println("Partial Match");
        } else {
            System.out.println("Not Match");
        }
    }
}
