package ExceptionHandling;

import java.util.Scanner;

import ExceptionHandling.Student.AgeNotWithinRangeException;
import ExceptionHandling.Student.NameNotValidException;

public class StudTest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter roll no,name,age,course");
		int rollno = scan.nextInt();
		String name = scan.next();
		int age = scan.nextInt();
		String course =  scan.next();
		
		Student s = new Student(rollno,name,age,course);

		try
		{ 
			s.checkAge();
	
		}
		catch(AgeNotWithinRangeException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{ 
			s.checkName();
		}
		catch(NameNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
