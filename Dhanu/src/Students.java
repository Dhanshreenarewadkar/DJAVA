import java.util.Scanner;

public class Students 
{
	int rollno;
	static int n;
	static int i;
	String name;
	float per;
	Students s[];
	public Students() {}
	
	
	public Students(int rollno,String name,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	
	void display()
	{
		System.out.println("rollno\tname\tper");
		System.out.println(rollno+"\t"+name+"\t"+per);
	}
	public static void sortStudent(Students s[],int n)
	{
		for(i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(s[j].per>s[j+1].per)
				{
					Students t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		
		for(i=0;i<n;i++)
			s[i].display();	
	}

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter number of students:\n");
		int n=scan.nextInt();
		
		Students[] s=new Students[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter rollno:");
			int rollno=scan.nextInt();
			
			System.out.println("enter name:");
			String name=scan.next();
			
			System.out.println("enter per:");
			int per=scan.nextInt();
			
			s[i]=new Students(rollno,name,per);
			
			
			
		}
		
		Students.sortStudent(s, n);	
		
	}

}
