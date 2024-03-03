import java.util.Scanner;

public class Recursive_Power {
    public static int power(int a,int b, int count){
        if(b == 0){
          return 1;
      }
      if(count == b){
          return a;
      }
      count++;
      return a * power(a, b, count);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int count = 1;
      int ans = power(a,b,count);
      System.out.println(ans);
  }
}
