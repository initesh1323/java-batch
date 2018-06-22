import java.util.Scanner;
class Armstrong{
public static void main(String[] arr){
int num,arm=0,rem;
System.out.println("input 3 digit");
Scanner in= new Scanner(System.in);
int x=in.nextInt();
num=x;
while(num!=0)
{
rem=num%10;
arm=arm+(rem*rem*rem);
num=num/10;
}
if (x==arm)
{
System.out.println("Armstrong");
}
else
{System.out.println("not an Armstrong");}}}
