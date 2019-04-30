package Test;
import java.util.Scanner;

import SY.SYMarks;
import TY.TYMarks;


public class Student 
{


	
	private	int rollNo;
		String name;
		TYMarks t;
		SYMarks s;
		
	
		public Student(int rollNo , String name,SYMarks s,TYMarks t)
		{
			this.name =name;
			this.rollNo = rollNo;
			this.t = t;
			this.s = s;
			
		}
		
		
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of students");
			int n = scan.nextInt();
			Student stud[] = new Student[n];
			
			int rollNo=0,computer=0,maths=0 ,electronic=0,theory=0,practical=0,i;
			String name=null,grade=null;
			
			for(i=0; i<n; i++)
			{
				System.out.println("Enter roll no : ");
				rollNo = scan.nextInt();
				System.out.println("Enter name : ");
				name = scan.next();
				System.out.println("Enter marks :");
				System.out.println("Enter computer total marks");
				computer = scan.nextInt();
				System.out.println("Enter maths total marks");
				maths = scan.nextInt();
				System.out.println("Enter electroic total marks");
				electronic = scan.nextInt();
				System.out.println("Enter theory marks");
				theory = scan.nextInt();
				System.out.println("Enter practical marks");
				practical = scan.nextInt();
				SYMarks s = new SYMarks(computer,maths,electronic);
				TYMarks t = new TYMarks(theory,practical);
				
				
				
				int total = computer + maths + electronic + theory +practical;
				int avg = total/5;
				
				if(avg >= 70)
				{
					grade = "A";
				}
				else if(avg >= 60)
				{
					grade = "B";
				}
				else if(avg >= 50 )
				{
					grade = "C";
				}
				else
				{
					grade = "c";
					System.out.println("Fail");
				}
				
				stud[i]= new Student(rollNo,name,s,t);
			}
			
			System.out.println("Roll Number \t  Name  \t Computer marks  \t  Maths marks  \t  Electronic marks \t theory marks \t practical marks \t Grade" );
			for(i=0;i<stud.length;i++)
			{
			System.out.println(rollNo+ "\t\t" +name+ "\t\t" +computer+ "\t\t" +maths+"\t\t"+electronic+ "\t\t" +theory+ "\t\t" +practical + "\t\t"+grade);
			}
			
	}
}
