import java.util.Scanner; 
class studentl6 
{
	int sno; 
	String sname; 
	studentl6() 
	{
		sno=1; 
		sname="rama"; 
	} 
	studentl6(int sno1,String sname1) 
	{ 
		this.sno=sno1; 
		this.sname=sname1; 
	} 
	void display() 
	{ 
	System.out.println(sno + sname); 
	} 
public static void main(String args[]) 
{ 
		studentl6 s=new studentl6(); 
		s.display(); 
		studentl6 s1=new studentl6(3,"sita"); 	
		s1.display(); 
		Scanner ob=new Scanner(System.in); 	
		int sno2=ob.nextInt(); 
		String sname2=ob.next(); 
		studentl6 s3=new studentl6(sno2,sname2); 
		s3.display(); 
} 
}