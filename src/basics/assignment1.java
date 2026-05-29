package basics;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//factorial with user input
		//FibonacciSeries with user input
		//even odd with user input
		//find greatest with user input
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number for factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial "+fact);
		
		
		
	
		System.out.println("------------------");
		System.out.println("enter number for fibonacciSeries");
		int b=sc.nextInt();
		int n1=0, n2=1, n3=0;
		for(int i=1; i<=b; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);	
			n1=n2;
			n2=n3;	
		}
		
		
		System.out.println("------------------");
		System.out.println("enter number ");

		int c=sc.nextInt();
		if(c%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		
		
		System.out.println("------------------");
		System.out.println("enter two number ");
		int d=sc.nextInt();
		int e=sc.nextInt();
		if(d<e)
		{
			System.out.println(d+" is smaller than "+e);
			
		}
		else if(d>e)
		{
			System.out.println(d+" is greater than "+e);

		}
		else if(e==d)
		{
			System.out.println(d+" both are equal "+e);

		}
		
		sc.close();



		
	}

}
