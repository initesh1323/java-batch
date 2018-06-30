import java.util.*;
import java.io.*;

class Frnd{
	String name;
	int age;
	
Frnd(String name,int age)
    {
	this.name=name;
     this.age=age;
	 
	}
}


class AgeComparator implements Comparator<Frnd>{
           public int compare(Frnd s1,Frnd s2){
	if(s1.age==s2.age)
	
	  return 0;
	else if(s1.age>s2.age)
      return 1;
    else
      return -1;
    
  }
}

class NameComparator implements Comparator<Frnd>{
           public int compare(Frnd s1,Frnd s2){
	  return s1.name.compareTo(s2.name);
	  }
	}

	class Frnd1{
	public static void main(String args[]){
	 
	ArrayList<Frnd> f=new ArrayList<Frnd>();
     
      f.add(new Frnd("kirat",19));
	  f.add(new Frnd("nitesh",20));
	  f.add(new Frnd("baddi",18));
	  f.add(new Frnd("Snady",17));
	  f.add(new Frnd("pardhan",19));
      f.add(new Frnd("rohit",14));
	      f.add(new Frnd("vivek",14));
		  
      	  System.out.println("Sort by name = " );
		  
	Collections.sort(f,new NameComparator());
	for(Frnd sr : f)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	System.out.println("Sort by age = ");
	
	Collections.sort(f,new AgeComparator());
	for(Frnd sr : f)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	}
	}