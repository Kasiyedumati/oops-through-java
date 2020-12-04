import MyPack.Balance;
import MyPack.B;
class AccountBalance
{
	public static void main(String args[])
	{
		Balance current[]=new Balance[3];
		B b1=new B();
		current[0]=new Balance("k.j.field",123.05);
		current[1]=new Balance("ashjugh",6540.3215);				
		current[2]=new Balance("dghfhgfh",-5420.31);
		for(int i=0;i<3;i++)
			current[i].show();
		b1.display();
}
}
