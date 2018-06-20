import java.util.Scanner;
class Vowel{
public static void main(String[] arg)
{  

Scanner in=new Scanner(System.in);
String r=in.nextLine();
StringBuffer abc=new StringBuffer()	;
for( int i=0;i<r.length();i++){

if((r.charAt(i)!='A') &&(r.charAt(i)!='E')&&  (r.charAt(i)!='a') && (r.charAt(i)!='I')&& (r.charAt(i)!='O') &&	(r.charAt(i)!='U')&& (r.charAt(i)!='e') &&(r.charAt(i)!='i')&&(r.charAt(i)!='o') &&(r.charAt(i)!='u'))
{		
abc.append(r.charAt(i));	
}
}
System.out.println(abc);
}
}
		