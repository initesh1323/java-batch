import java.util.Scanner;
class Reverse{
public static void main(String[] arr){
int x;
int reverse=0;
System.out.println("enter value");
Scanner in=new Scanner(System.in);
x=in.nextInt();
while(x !=0)
{
reverse=reverse*10;
reverse=reverse+x%10;
x=x/10;
}
System.out.println(reverse);}}