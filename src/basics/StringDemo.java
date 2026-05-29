package basics;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		//string is non primitive datatype
		//string is immutable(indexing will not change)
		//string max length is 2'32-2
		//string is char array
		
		
		String a="have a nice day";
		String b="Have a Nice Day";
		
		//1.---CharAt is predifined method used to find indexing of characters
		
		for(int i=0;i<a.length();i++)
		{
			System.out.println(" position "+i+" value "+a.charAt(i));
		}
		
		
		//2.---trim function is used to remove or trim extra space from character 
		
		System.out.println(a.trim());
		
		//3.---replace function is used to replace existing words with new
		
		System.out.println(a.replace("day","have"));
		
		
		//4.----ToUpperCase is predefined method used to convert all char to capital letters
		//5.----ToLowerCase is predefined method used to convert all char to lower letters

		
		System.out.println("UPPER CASE DATA :-"+a.toUpperCase());
		
		System.out.println("LOWER CASE DATA :-"+a.toLowerCase());
		
		//6.----substring is predefined method is used to get or print values from the variable with help of start index and end index
		
		System.out.println(a.substring(3,10));
		
		
		//7.----contains is predefined method of string which check whether given data exist in variable or not
		
		if(a.contains("good")) {
			System.out.println("Match found for good data");
		}else {
			System.out.println("Match not found for good data");
		}

		
		
		//8.----StartsWith is predefined method String which checks whether first given data starts with the given characters or not
		
		if(b.startsWith("have"))
		{
			System.out.println("data had have word");
		}else {
			System.out.println("data does not have word");
		}
		
		
		//9.----endtsWith is predefined method String which checks that the ending characters are getting method or not

		if(b.endsWith("Day"))
		{
			System.out.println("Match Successfully");
		}else {
			System.out.println("Did not Matched");
		}
		
		//equals is predefined method of String 
		//it is used to check whether data get match or not
		//equals method also check uppercase and lowercase verification
		
		if(a.equals(b))
		{
			System.out.println("Match found.....");
		}else {
			System.out.println("Match Not Found");
		}
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Match found.....");
		}else {
			System.out.println("Match Not Found");
		}
		
		System.out.println("enter your name");
		String n=sc.next();
		//String m=sc.nextLine();
		
		//next() is predefined method of Scanner class
		//it is used to store only first single word in variable 
		System.out.println("welcome "+n);
		
		
		
		
		//nextline is predefined method of Scanner class
		//it is used to store all charaters given by user in variable
		
		
		
		System.out.println(a.substring(3,10));

		
		sc.close();

	}

}
