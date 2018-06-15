class Complex{
int real;
int imaginery;
public void setReal(int a){
real =a;
}
public void setImaginery(int b){
imaginery= b;
}
void Display()
{
System.out.println(real+ "+" +imaginery+ "i");
}
public static void main(String[] arr){
Complex c=new Complex();
c.setReal(3);
c.setImaginery(9);
c.Display();
}}