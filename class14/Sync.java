import java.util.*;
import java.lang.Thread;
import java.io.*;
class Sync extends Thread
 {

static int i=1;
public synchronized void print()
   {
for (int j=0;j<500;j++)
  {
  System.out.println(this.i++);
  
 }}
  public void run()
  
  {
  print();
  }
  public static void main(String[] arg)throws InterruptedException
  {
  Sync s=new Sync();
  Thread p=new Thread(s);
  Thread o=new Thread(s);
  p.start();
  o.start();
  }}