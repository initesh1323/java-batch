import java.util.Scanner;
class Arrayn{
public static void main(String[] abc){
int arr[]={1,3,4,5,6};
int a,i;
Scanner in= new Scanner (System.in);
a=in.nextInt();
for(i=0;i<arr.length;i++)
{
if(arr[i]==a)
System.out.println("present");
else
System.out.println("not in array");
}}}