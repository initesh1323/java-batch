abstract class Animals{
String breed,colour,name;
abstract void eat();
void speak(){
System.out.println("speaking");
}}
class dog extends Animals{
dog(String breed,String colour,String name){
this.breed=breed;
this.colour=colour;
this.name=name;
}
void me(){
System.out.println("name is:"+name);
System.out.println("colour is:"+colour);
System.out.println("breed is: "+breed);
}
void eat(){
System.out.println("i eat feed");
}
}
 public class Main {
public static void main(String[] args){
Animals an=new dog("ritriver","brown","bruno");
dog d =new dog("ritriver","brown","bruno");
d.me();
an.eat();
an.speak();
}
}