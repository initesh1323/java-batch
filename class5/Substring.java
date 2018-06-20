import java.util.Scanner;
class Substring{
public static void main(String[] arg){
	String subs,sub;
Scanner in=new Scanner(System.in);
System.out.println("enter any string");
 sub=in.nextLine();
int length=sub.length();
 System.out.println("Substring of\""+sub+"\"are");
 for(int i=0;i<length;i++)
 {
 for (int j=1;j<=length-i;j++)
 {
 subs=sub.substring(i,i+j);
 System.out.println(subs);
 }}}}