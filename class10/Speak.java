class Animals
{
void speak()
{
System.out.println("Speaking");
}
}
class Dog extends Animals
{
void speak()
{
System.out.println("Dog");
}
}
class Cat extends Animals
{
void speak()
{
System.out.println("cat");
}
}
class Speak
{
public static void main(String[] arg)
{
Animals a=new Dog();
a.speak();
Animals c=new Cat();
c.speak();
}
}