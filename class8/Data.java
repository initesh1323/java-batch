import java.io.*;
class Data
{
public static void main(String[] arg)throws IOException
{
	int a;
File f=new File("D:\\abc.txt");
File b=new File("D:\\png.txt");
FileInputStream fis= new FileInputStream(f);

   FileOutputStream fos=new FileOutputStream(b);
   
   while((a=fis.read())!=-1)
   {
	   fos.write(a);
	   fos.flush();
}}}
	   