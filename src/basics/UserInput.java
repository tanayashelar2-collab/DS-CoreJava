package basics;

import java.util.Scanner;//on Scanner press ctrl+space and then select 

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hard code - we give values in code itself 
		Scanner sc=new Scanner(System.in);
		//call         execute
		//Scanner is predefined class from java.util package
		
		System.out.println("enter any two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();

		//nextInt is predefined function of Scanner class
		//it will allow only integer value to store inside the variable
		
		System.out.println("addition "+(a+b));
		
		
		//double is datatype use for storing decimal number
		//12.33333333333334
		
		System.out.println("enter any two decimal number");
		
		double c=sc.nextDouble();        
		double d=sc.nextDouble();
		
		System.out.println("sub "+(c-d));
		
		
		//float is datatype use for storing decimal number
		//12.34
		
		System.out.println("enter any two decimal number");
		
		float i=sc.nextFloat();          // when we dont want input from user then we do ---i=2f; we have to mention f
		float j=sc.nextFloat();
		
		System.out.println("add "+(i+j));
		
		


		
	}

}
