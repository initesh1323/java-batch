import java.util.Scanner;
class Prime{
   public static void main(String[] arr)
{		
int i,j,a;
int count=0;
System.out.println("enter value");
Scanner in=new Scanner(System.in); 
a=in.nextInt();
for(i=2;i<=a;i++){
	for(j=1;j<i;j++){
if(i%j==0){
	count++;
}
	}
	if(count==1){
		System.out.println(i);}
		count=0;
}
}
}
