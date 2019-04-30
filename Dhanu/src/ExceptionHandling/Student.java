package ExceptionHandling;

public class Student 
{

	private int rollno;
	private String name;
	private int age;
	private String course;
	
	public Student(int rollno, String name, int age, String course)
	{
		this.rollno=rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	class AgeNotWithinRangeException extends RuntimeException
	{ 
		public AgeNotWithinRangeException(String msg)
		{
			super(msg);
		}
		
	}

	class NameNotValidException extends RuntimeException
	{
		public NameNotValidException(String msg)
		{
			super(msg);
		}
	}
	
	
	
	public void checkAge()throws AgeNotWithinRangeException
	{
			if (age>15 && age<21)
			{
				throw new AgeNotWithinRangeException("Invalid age.....");
			}
	}
	
	public void checkName()throws NameNotValidException
	{
		
		for(int i= 0;i<name.length();i++)
		{
			char ch;
			ch=name.charAt(i);
			if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
			{
				{
					throw new NameNotValidException("Invalid name.....");
				}
			}
			
		}
		
	}
}
