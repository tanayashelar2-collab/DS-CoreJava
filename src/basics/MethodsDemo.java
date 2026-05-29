package basics;

public class MethodsDemo {

//method should be created outside main method but inside the class
	
//4 Types of method 
	
//1.basic method (non static method)
//2.method with parameters
//3.method without void
//4.static method
	
	
//Basic Method
	
public void add()//declaration of method
{
	//body of method
	int a=4,b=5;
	System.out.println("addition is "+(a+b));
}


public void sub()
{
	int a=5,b=7;
	System.out.println("Subtraction is "+(a-b));
}

public void addition()
{
	int a=5,b=3;
	System.out.println("addition is "+(a+b));
}

//2.method with parameters
public void subtraction(int a,int b,int c)
{
	System.out.println("subtraction "+(a-b-c));
}
 

//3.method without void
public int mul(int c,int d)
{
	return c*d;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo obj=new MethodsDemo();
		//class call          class execute - instance of that class
		
		obj.sub();
		obj.add();
		obj.addition();
		obj.subtraction(2,3,5);
		System.out.println("Multiplication "+obj.mul(12,15));
		
		
		//syntax
		//Classname objectname =new classname();
		//objectname.method_name();

	}

}
