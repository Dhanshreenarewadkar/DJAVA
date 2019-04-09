class Student 
{
	 int rollno;
	 String name;
	 float per;
	 private static int count=0;
	 public Student()
	 {
		
	 }
	 public Student(int rollno,String name,float per)
	 {
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		count++;
		System.out.println("Number of objects:"+count);
		
	 }
	 
		
	 public String toString()
	 {
		return "rollno="+rollno+ ",name="+name+",per:"+per;
	 }
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"ram",(float) 50.45);
		System.out.println(s1);
		
		
		Student s2 = new Student(2,"sham",(float)90.45);
		System.out.println(s2);
		
		Student s3 = new Student(2,"sham",(float)90.45);
		System.out.println(s3);
		
	}
	
}
