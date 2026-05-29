package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
		//arrays is collection of multiple elements
		
		Scanner sc=new Scanner(System.in);
		
		//         0,1,3,4
		int a[]= {12,5,44,74,85,65,79,25};
		
		System.out.println(a.length);
		
		
		for(int i=0;i<a.length; i++) {
			
			//                  position   1   value     3
			System.out.println("position "+i+" value "+a[i]);
		}
		
		System.out.println(Arrays.toString(a));

		
		//with user input
		int b[]=new int[4];
		
		System.out.println("Enter any 4 numbers:-");
		b[0]=sc.nextInt();
		b[1]=sc.nextInt();
		b[2]=sc.nextInt();
		b[3]=sc.nextInt();
		
		System.out.println(Arrays.toString(b));
		//or
		
		System.out.println("enter any length you want ");
		int g=sc.nextInt();
		
		//int f[]=new int[12];
		int f[]=new int[g];

		System.out.println("enter any "+f.length+" Number");
		
		for(int i=0;i<f.length;i++)
		{
			f[i]=sc.nextInt();
		}
		
		
		
		//copyOf 
		
		int e[] = {10,20,30,40};
		
		int n[]=Arrays.copyOf(e, 10); 
		
		System.out.println("Array data of e variable :-"+Arrays.toString(e));
		
		System.out.println("Array data of n variable :-"+Arrays.toString(n));
		
		//copyOf is predefined method of arrays 
		//it is used to copy the data of existing array to the newest array variable 

		
		//Array is predefined class from java.util package
		//toString is used to print all the values together
		//toString is also used prevent garbage values
		
		
		//assignment-even odd number using arrays - [12,13,78,89,34,23]
		
		
		int c[]= {12,13,78,89,34,23};
		for(int i=0;i<c.length; i++) 
			{
			if(c[i]%2==0) {
				System.out.println(c[i]+" is even nuber ");
			}else {
				System.out.println(c[i]+" is odd number");
			}
		}

		sc.close();
	}

}
