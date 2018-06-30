import java.lang.String;
import java.util.*;
import java.util.Arrays; 

class Ats{
		public static <any_type> void printArr(any_type[] inputArr){
		
		
			for(any_type element : inputArr)
			{
			System.out.printf("%s",element);
			}
		
		System.out.println();
		}
	
		public static void main(String args[]){

			Integer[] a={1,1,2,3,4,5};
			
			Arrays.sort(a);
			 System.out.println("Modified arr[] = " + Arrays.toString(a));
			 
			 String[] s={"ND","sher","Sh","bilii","jai ho"};
			 
			 Arrays.sort(s);
			  System.out.println("Modified s[] = " + Arrays.toString(s));
			  
			 double sh[]={2.2,7.2,4.5,8.3,2.7};
			 			Arrays.sort(sh);
			  System.out.println("Modified sh[] = " + Arrays.toString(sh));
			  
							}
}