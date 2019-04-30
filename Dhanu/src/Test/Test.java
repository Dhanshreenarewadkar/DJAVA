package Test;

import Maths.MathsOperation;
import Stats.StatOperations;


public class Test 
{

	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		MathsOperation m = new MathsOperation(a,b,c);
		StatOperations s = new StatOperations(a,b,c);
		m.maximum();
		m.minimum();
		
		s.average();
		s.median();
		
	}
}
