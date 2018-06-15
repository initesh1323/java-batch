import java.util.Scanner;
class Arrayl{
public static void main(String[] abc){
int i,j,k,x;
System.out.println("enter array");
Scanner in=new Scanner(System.in); 
int arr[]=new int[5];

for(i=0;i<5;i++)
{ arr[i]=in.nextInt();
}
for(j=0;j<arr.length;j++)
{
	for(k=0;k<arr.length-1;k++)
		if(arr[k]>arr[k+1])
{x=arr[k];
arr[k]=arr[k+1];
arr[k+1]=x;
}
}
System.out.println(arr[4]);
}}