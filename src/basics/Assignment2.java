package basics;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASSIGNMENT
		// ENTER PIN CODE 
		//12344 - INVALID
		//PLEASE ENTER PIN AGAIN
		//345 - INVALID  
		//PLEASE ENTER PIN AGAIN
		//455566
		//ACC BLOCKED
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your pin code:");
		String Pin=sc.next();
		
		for(int i=1;i<=3;i++)
		{
			if(i<=2)
			{
				if(Pin.equals("12345"))
				{
					System.out.println("Pin is Valid");
					break;
				}
				else
				{
					System.out.println("Pin is invalid ......please try again");
					Pin=sc.next();
				}
			}
			else if(i==3)
			{
				System.out.println("Account is blocked");
			}
		}

	}

}
