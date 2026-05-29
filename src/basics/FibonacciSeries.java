package basics;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3,b=10;
		for(int i=1;i<=b; i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}

	}

}
