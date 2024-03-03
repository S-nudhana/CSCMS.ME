import java.util.Scanner;

public class Happy_new_year_2020_Sprinkler {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arrS = new String[n];
        int[][] arr = new int[n][m];

        for(int i = 0;i < n;i++){
            arrS[i] = sc.next();
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(arrS[i].charAt(j) == 'S'){
                    for(int k = j;k >= 0;k--){
                        if(arrS[i].charAt(k) == 'X'){
                            break;
                        }else{
                            arr[i][k] += 1;
                        }
                    }
                    for(int k = j + 1;k < m;k++){
                        if(arrS[i].charAt(k) == 'X'){
                            break;
                        }else{
                            arr[i][k] += 1;
                        }
                    }
                    for(int k = i - 1;k >= 0;k--){
                        if(arrS[k].charAt(j) == 'X'){
                            break;
                        }else{
                            arr[k][j] += 1;
                        }
                    }
                    for(int k = i + 1;k < n;k++){
                        if(arrS[k].charAt(j) == 'X'){
                            break;
                        }else{
                            arr[k][j] += 1;
                        }
                    }
                }
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
