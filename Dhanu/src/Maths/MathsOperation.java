package Maths;

public class MathsOperation 
{
	private static int a, b, c;

	public  MathsOperation(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public static void maximum()
	{
		if(a > b)
		{
			System.out.println(a+ "is maximum");
		}
		else if(b > c)
		{
			System.out.println(b+ "is maximum");
		
		}
		else
		{
			System.out.println(c+ "is maximum");
			
		}
	}
	public static void minimum()
	{
		if(a < b)
		{
			System.out.println(a+ "is minimum");
			
		}
		else if(b < c)
		{
			System.out.println(b+ "is minimum");
			
		}
		else
		{
			System.out.println(c+ "is minimum");
			
		}
	}

}
