package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read input from user asking what operation should be performed
		
		
		System.out.println("Which operation you need to perform?");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//compare input with addition,sub,mul,div
		//if condition is used for comparing in java
		if(input.equalsIgnoreCase("addition"))
		{
			System.out.println(num1+num2);
		}
		if(input.equalsIgnoreCase("subtraction"))
		{
			System.out.println(num1-num2);
			
		}
		if(input.equalsIgnoreCase("multiplication"))//=. operator is used for comparison
		{
			System.out.println(num1*num2);//* operator is used for multiplication
			
		}
		if(input.equalsIgnoreCase("division"))//equalsIgnoreCase() method is used for comparison
		{
			System.out.println(num1/num2);/// operator is used for division
			
		}
		
		
		
		

	}

}
