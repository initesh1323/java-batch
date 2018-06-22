 import java.util.Scanner;
 class Arraywave{
 public static void main(String[] arg){
int x,j,i,k;
 Scanner in=new Scanner(System.in);
 int arr[]=new int[5];
 System.out.println("enter array");
 for(i=0;i<5;i++)
 {
 arr[i]=in.nextInt();
 }
 for(j=0;j<arr.length-1;j+=2)
 {
 x=arr[j];
 arr[j]=arr[j+1];
 arr[j+1]=x;
 }
 for (k=0;k<arr.length;k++)
 {System.out.println(arr[k]);}
 }}