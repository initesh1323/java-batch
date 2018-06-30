import java.util.Scanner;
import java.util.*;

class Change{
	public static void main (String args[]){
		
	
	
Scanner p=new Scanner(System.in);
System.out.print("Enter the date = ");
String date=p.nextLine();
	 

	 
	HashMap<Integer,String> d=new HashMap<Integer,String>();
	d.put(01,"One");
	d.put(02,"Two");
    d.put(03,"Three");
	d.put(04,"Four");
    d.put(05,"Five");	
    d.put(06,"Six");	
	d.put(07,"Seven");
	d.put(8,"Eight");
	d.put(9,"Nine");
	d.put(10,"Ten");
	d.put(11,"Eleven");
	d.put(12,"Twelve");
	d.put(13,"Thirteen");
	d.put(14,"Fourteen");
	d.put(15,"Fifteen");
	d.put(16,"Sixteen");
	d.put(17,"Seventeen");
	d.put(18,"Eighteen");
	d.put(19,"Nineteen");
	d.put(20,"Twenty");
	d.put(21,"Twenty One");
	d.put(22,"Twenty Two");
	d.put(23,"Twenty Three");
	d.put(24,"Twenty Four");
	d.put(25,"Twenty Five");
	d.put(26,"Twenty Six");
	d.put(27,"Twenty Seven");
	d.put(28,"Twenty Eight");
	d.put(29,"Twenty Nine");
	d.put(30,"Thirty");
	d.put(31,"Thirty one");
	
	
	HashMap<Integer,String> m=new HashMap<Integer,String>();
	m.put(01,"January");
    m.put(02,"February");
	m.put(03,"March");
	m.put(04,"April");
	m.put(05,"May");
    m.put(06,"June");
    m.put(07,"July");	
	m.put(8,"August");
    m.put(9,"September");	
	m.put(10,"October");
	m.put(11,"November");
	m.put(12,"December");
	
	HashMap<Integer,String> y=new HashMap<Integer,String>();
	y.put(2000,"Two Thousand");
	y.put(2001,"Two Thousand One");
	y.put(2002,"Two Thousand Two");
	y.put(2004,"Two Thousand Four");
	y.put(2005,"Two Thousand Five");
	y.put(2006,"Two Thousand Six");
	y.put(2007,"Two Thousand Seven");
	y.put(2008,"Two Thousand Eight");
	y.put(2009,"Two Thousand Nine");
	y.put(2010,"Two Thousand Ten");
	y.put(2011,"Two Thousand Eleven");
	y.put(2012,"Two Thousand Twelve");
	y.put(2013,"Two Thousand Thirteen");
	y.put(2014,"Two Thousand Fourteen");
	y.put(2015,"Two Thousand Fifteen");
	y.put(2016,"Two Thousand Sixteen");
	y.put(2017,"Two Thousand Seventeen");
	y.put(2018,"Two Thousand Eighteen");
	y.put(2019,"Two Thousand Nineteen");
	
	int sh1= Integer.parseInt(date.substring(0,2));
	int sh2= Integer.parseInt(date.substring(2,4));
	int sh3= Integer.parseInt(date.substring(4,8));
	System.out.println(sh1);
	System.out.println(sh2);
	System.out.println(sh3);
  
System.out.println("The date you entered = " + (d.get(sh1) + " " + m.get(sh2) + " " + y.get(sh3)));
	}
	}