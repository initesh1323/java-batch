import java.util.Scanner;
class Occurence{
public static void main(String[] arg){
Scanner in=new Scanner(System.in);
String r=in.nextLine();
System.out.println("enter string");
String u=in.nextLine();
System.out.println("enter string2");
boolean c=r.contains(u);
if(c==true)

System.out.println("present");
else
System.out.println("absent");
}}