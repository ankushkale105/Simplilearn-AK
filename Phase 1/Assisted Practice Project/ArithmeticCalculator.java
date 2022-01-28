package Assisted_Practice_Project_;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		double number1 , number2, result=0;
		char operator;
		
		Scanner  a=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		number1 = a.nextDouble();
		
		System.out.println("Enter the operator: +,-,* or /");
		operator = a.next().charAt(0);
		
		System.out.println("Enter the second number");
		number2 = a.nextDouble();
		
		switch (operator) {
		case '+':
			result = number1 + number2;
			break;
			
		case '-':
			result = number1-number2;
			break;
		case '*':
			result = number1*number2;
			break;
			
		case '/':
			result = number1/number2;
			break;
			default:
				System.out.println("You have entered wrong input");
				break;
				
		}
		System.out.println("\nThe Final result is :");
		
		System.out.println(number1+" "+operator+" "+number2+ " = "+result);
	}
}
