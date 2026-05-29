package basics;

import java.util.Scanner;

public class StaticDemo {
	
	//Static should not be given as class name
	//Static is non access modifier
	//Static is not an object member
	//Static is class member
	
	static Scanner sc=new  Scanner(System.in);
	
	public static void Div()
	{
		int c=4,d=5;
		System.out.println("Div "+(c/d));
	}
	
	
	public static void PinLogin()
	{
		System.out.println("Enter your pin number");
		String p=sc.next();
		if(p.equals("12345"))
		{
			System.out.println("Pin is Valid");
		}else {
			System.out.println("Pin is invalid");
			PinLogin();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div();
		StaticDemo.Div();
		//CLASSNAME.static_method_name()
		PinLogin();
		

	}

}
