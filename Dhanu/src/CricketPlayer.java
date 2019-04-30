import java.util.Scanner;

public class CricketPlayer
{
	
	String name;
	int no_of_innings;
	int no_times_notout;
	int total_runs;
	double bat_avg;
	CricketPlayer c[];
		
	
	public CricketPlayer() {}
	public CricketPlayer(String name,int no_of_innings,int no_times_notout,int total_runs)
	{
		this.name=name;
		this.no_of_innings=no_of_innings;
		this.no_times_notout=no_times_notout;
		this.total_runs=total_runs;
	
	}
	
	void cal_avg()
	{
		bat_avg=total_runs/no_of_innings;
	}
	
	double getavg()
	{
		return bat_avg;
	}
	
	void display()
	{
		System.out.println("name="+name+ ",no_of_innings="+no_of_innings+",no_times_notout:"+no_times_notout+",total_runs="+total_runs+",bat_avg="+bat_avg+"\n");
		
	}
	
	
	
	
	public static void sortPlayer(CricketPlayer c[],int n)
	{
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(c[j].getavg()>c[j+1].getavg())
				{
					CricketPlayer t=c[j];
					c[j]=c[j+1];
					c[j+1]=t;
				}
			}
		}
		
		for(int i=0;i<n;i++)
			c[i].display();
		
		
	}
	
	public static void main(String[] args) 
	{

		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("enter number of players:\n");
		int n=scan.nextInt();
		
		CricketPlayer c[]=new CricketPlayer[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("enter name:");
			String name=scan.next();
			
			System.out.println("enter no_of_innings:");
			int no_of_innings=scan.nextInt();
			
			System.out.println("enter no_times_notout:");
			int no_times_notout =scan.nextInt();
			
			System.out.println("enter total_runs:");
			int total_runs=scan.nextInt();
			
			
			
			c[i]=new CricketPlayer(name,no_of_innings,no_times_notout,total_runs);	
			c[i].cal_avg();
				
		}
		
		
		CricketPlayer.sortPlayer(c,n);
		
		
	}

}
