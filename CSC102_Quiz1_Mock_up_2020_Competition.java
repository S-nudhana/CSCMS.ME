import java.util.Scanner;

public class CSC102_Quiz1_Mock_up_2020_Competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.nextLine();
        String B = sc.nextLine();
      	int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int bwin = 0, awin = 0;
        boolean aper = false, bper = false;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i])
                awin++;
            else if (a[i] < b[i])
                bwin++;
            if (awin == 2 && bwin == 0) {
                aper = true;
                break;
            }
            if (awin == 0 && bwin == 2) {
                bper = true;
                break;
            }
        }
        if (aper || bper) {
            System.out.print("Perfect Win (");
            System.out.print(aper ? A : B);
            System.out.print(")");
        } else if (awin + bwin != 0) {
            System.out.print("Win (");
            System.out.print(awin > bwin ? A : B);
            System.out.print(")");
        } else
            System.out.println("Draw");
        System.out.println();
        sc.close();
    }
}
