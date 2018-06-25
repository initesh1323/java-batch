import java.util.Scanner;
import java.util.*;
import java.io.*;
class Arr{
public static void main(String[] arg)
{
int j,i,k;
int arr[]=new int[10];
Scanner in =new Scanner (System.in);
try
{
for(i=0;i<12;i++)
{
arr[i]=in.nextInt();
}
}
catch(Exception e)
{
System.out.println(e);
int size=(int)(arr.length*1.5f);
int array[]=new int[size];
System.arraycopy(arr,0,array,0,arr.length);
for(k=12;k<size;k++)
{
array[k]=in.nextInt();
}
for(j=0;j<array.length;j++)
System.out.print(array[j]+"  ");
}
}
}