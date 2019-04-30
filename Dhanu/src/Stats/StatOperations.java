package Stats;

public class StatOperations 
{

	private int x, y, z;
	public StatOperations(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void average()
	{
		float avg = (x + y + z)/3;
		System.out.println("Average="+avg);
		
	}
	public void median()
	{
		System.out.println("Median="+y);
	}
}
