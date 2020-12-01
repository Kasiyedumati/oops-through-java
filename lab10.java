class lab10
{
 static int count=0;
 void incr()
 {
  count++;
 }
 public static void main(String args[])
 {
 lab10 c1=new lab10();
 c1.incr();
 lab10 c2=new lab10();
 c2.incr();
 lab10 c3=new lab10();
 c3.incr();
 lab10 c4=new lab10();
 c4.incr();
 System.out.println("number of objects="+count);
 }
}
