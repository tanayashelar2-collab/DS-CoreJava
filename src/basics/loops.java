package basics;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// loops are 3 type:-
		//while loop
		//do while loop 
		//for loop
		
		System.out.println("----While Loop----");//condition check in starting
		
		int a=1; 
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
		
		
		
		System.out.println("----Do While Loop----");//condition check in end , first value print as it is weather it satisfied condition or not 
		int b=2;		
		do
		{
			System.out.println(b);
			b++;
		}
		while(b<10);
		
		
		
		System.out.println("----for While Loop----");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("----Reverse Loop----");
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
	}

}
