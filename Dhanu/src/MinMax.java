
public class MinMax 
{
	private static int a,b,c;
	@SuppressWarnings("static-access")
	public MinMax(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void max()
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
	public void min()
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
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		MinMax z=new MinMax(a,b,c);
		z.max();
		z.min();
	}
	

}
