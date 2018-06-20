
import java.io.*;
class File1
{
public static void main(String[] arg)throws IOException
{
File f=new File("D:\\ab.txt");
FileInputStream x=new FileInputStream(f);
int a;
while((a=x.read())!=-1)
{
System.out.print((char)a);
}}}