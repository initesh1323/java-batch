
            import java.util.*;
            class Hashc{
		
                public static void main(String args[]){
                    HashMap<String,String> hs=new HashMap<String,String>();
                    hs.put("first","a");
                    hs.put("Second","b");
				
                    hs.put("thi","n");
                    hs.put("bhai","m");
                    hs.put("chaku","p");
                    hs.put("F","q");
					Set he=hs.entrySet();
					Iterator i=he.iterator();
					while(i.hasNext())
					{
						
				Map.Entry n=  (Map.Entry)i.next();
                    System.out.println("  "+n.getKey());
					System.out.println("  "+n.getValue() );
			}}}
					
					
					
					