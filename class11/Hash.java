
            import java.util.*;
            class Hash{
		
                public static void main(String args[]){
                    Set<String> hs=new HashSet<>();
                    hs.add("first");
                    hs.add("Second");
				
                    hs.add("thi");
                    hs.add("bhai");
                    hs.add("chaku");
                    hs.add("F");
					Object[] arr=hs.toArray(new String[hs.size()]);
					Set<String> hs1=new HashSet<>();
					 hs1.add("Second");
				
                    hs1.add("thi");
                    hs1.add("bhai");
                    hs1.add("chaku");
                    hs1.add("F");
				
					Object[] avv=hs1.toArray(new String[hs.size()]);
					for(int i=0;i<arr.length;i++)
{
for( int j=0;j<avv.length;j++)
						{
					if(arr[i]==avv[j])
					System.out.println(avv[j]);
					}}}}