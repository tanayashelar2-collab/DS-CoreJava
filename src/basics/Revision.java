package basics;

import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double a=2.3,b=4.5;
		System.out.println("add "+(a+b));
		System.out.println("sub "+(a-b));
		System.out.println("mul "+(a*b));
		System.out.println("Div "+(a/b));



		//It is mandatory to mention f in front of float number
		float c=2.9f, d=2.5f;
		System.out.println("add "+(c+d));
		System.out.println("sub "+(c+d));
		System.out.println("mul "+(c*d));
		System.out.println("Div "+(c/d));
		
		System.out.println("Enter number");
		int e=sc.nextInt();
		if(e%2==0) {
			System.out.println(e+" number is even");
		}
		else {
			System.out.println(e+" number is odd");
		}
		
		
		
		// multiple if-else example
		System.out.println("Enter any Two number");
		int f=sc.nextInt();
		int g=sc.nextInt();

		if(f<g)
		{
			System.out.println(g+" is greater then "+f);	
		}
		else if(f>g)
		{
			System.out.println(f+" is greater then "+g);
		}
		else if(f==g)
		{
			System.out.println(f+" both are equal "+g);
		}

	}

}
