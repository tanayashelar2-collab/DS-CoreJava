package basics;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Types of 
		//1.Simple IfElse
		//2.Multiple IfElse
		//3.Nested IfElse
		//If else 
		
		//eg of odd even number
		
		int a=8;
		//% is modulus--modulus means it consider remainder as a result
		if(a%2==0) {
			System.out.println(a+" number is even");
		}
		else {
			System.out.println(a+" number is odd");
		}
		
		
		
		// multiple if-else example
		int c=17,d=15;
		if(c<d)
		{
			System.out.println(d+" is greater then "+c);	
		}
		else if(c>d)
		{
			System.out.println(c+" is greater then "+d);
		}
		else if(c==d)
		{
			System.out.println(d+" both are equal "+c);
		}
		

	}

}
