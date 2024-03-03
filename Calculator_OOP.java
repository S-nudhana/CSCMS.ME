import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator_OOP {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BasicCalculator cal = new BasicCalculator();
		String expression = sc.nextLine();
		StringTokenizer st = new StringTokenizer(expression);
		int count = 1;
		String operator = "";
	    while (st.hasMoreTokens()) {
	        //System.out.println(st.nextToken());
	        if(count==1){
				cal.add(Double.parseDouble(st.nextToken()));
			}
			else{
				if(count%2==1){
					operator = st.nextToken();
				}
				else{
					switch(operator){
						case "+": cal.add(Double.parseDouble(st.nextToken())); break;
						case "-": cal.substract(Double.parseDouble(st.nextToken())); break;
						case "/": cal.divide(Double.parseDouble(st.nextToken())); break;
						case "*": cal.multiply(Double.parseDouble(st.nextToken())); break;
					}
				}
			}
	        count++;
	    }
	    System.out.println(cal.getResult());
	}
}

class BasicCalculator{
    private double result;
    
    public BasicCalculator(){
        
    }
    public double getResult(){
        return result;
    }
    public void clear(){
        result = 0;
    }
    public void add(double i){
        result += i;
    }
    public void substract(double i){
        result -= i;
    }
    public void divide(double i){
        result /= i;
    }
    public void multiply(double i){
        result *= i;
    }
}