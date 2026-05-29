package basics;

import java.util.Scanner;

public class PracTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter emp id:-");
		int empid=sc.nextInt();
		
		System.out.println("enter emp name:-");
		String empname=sc.next();
		
		System.out.println("enter emp salary:-");
		double empsal=sc.nextDouble();
		
		
		System.out.println("---------EMP DETAILS-------");
		System.out.println("\n Emp ID:-"+empid);
		System.out.println("\n Emp NAME:-"+empname);
		System.out.println("\n Emp SALARY:-"+empsal);

	}

}
