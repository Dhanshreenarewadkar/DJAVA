
import java.util.Scanner;

interface Abc {
	boolean isPositive();
	boolean isPrime();
	boolean isEven();
	boolean isOdd();
	
}

public class MyNumber implements Abc {
	private int n;

	public MyNumber() {
		n = 0;

	}
	
	public MyNumber(int n) {
		this.n = n;
	}

	
	public boolean isPositive() {
		if (n >= 0)
			return true;
		else
			return false;
	}

		public boolean isPrime() 
	{
		int i=2;
		for (i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false;
	            
	            	return true;
		
	}
	public boolean isEven()
	{
		if(n%2==0)
			return true;
		else
		return false;
	
	}
	
	public boolean isOdd()
	{
		if(n%2!=0)
			return true;
		else
		return false;
	
	}
	

		public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		MyNumber num = new MyNumber(n);

		while(true) {
		System.out.println("Enter your choice" );
		System.out.println("1. Is Positive or negative");
		System.out.println("2. Is prime");
		System.out.println("3. Is Even");
		System.out.println("4. Is Odd");
		int ch=scan.nextInt();
		switch(ch)
		{
			case 1:if(num.isPositive())
					System.out.println(n+" is positive ");
				else
					System.out.println(n+" is negative ");
					break;
					
			case 2:if(num.isPrime())
			System.out.println(n+"is prime");
			else
				System.out.println(n+"is not prime");
			break;
			
			case 3:if(num.isEven())
				System.out.println(n+"is even");
			else
				System.out.println(n+"is not even");
			break;
			
			case 4:if(num.isOdd())
				System.out.println(n+"is odd");
			else
				System.out.println(n+"is not odd");
			break;
			
			default: System.out.println("");
		
			break;
			
			
		}
	}
	}
}

