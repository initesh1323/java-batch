public interface Animals {
void speak();
void eat();
public static void main(String[] arr){
Dog d=new Dog();
d.speak();
d.eat();
Cat c=new Cat();
c.speak();
c.eat();
}}
class Dog implements Animals{
public void speak(){
System.out.println("i am dog. i can bark");
}

public void eat(){
System.out.println("i am dog. i eat bones");
}
}
class Cat implements Animals{
public void speak(){
System.out.println("i am cat. i meawww");
}
 public void eat(){
System.out.println("i am cat. i eat rats ");
}
}