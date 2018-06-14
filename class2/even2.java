 import java.util.Scanner;
class even2{
public static void main(String[] abc){
int i,num;
System.out.println("enter number");
Scanner in = new Scanner(System.in);
num = in.nextInt();

for(i=0;i<=num;i++){

if(i%2==0){System.out.println(i);}
}
}
}