class Null
{
public void print(int i,float f)
{
System.out.println(i);
System.out.println(f);
}

public void print(){
	System.out.println("no argument method");
}
public static void main(String[] arg)
{
Null n=new Null();
n.print(1,2.5f);
n.print();	
}}