
package org.me.maslahnya;

public class Kehilangan 
{
   int x = 0;
   
   Thread p = new Thread()
   {
        @Override
     public void run()
     {
         tambahAngka();
     }
   };
   Thread q = new Thread()
   {
        @Override
     public void run()
     {
         tambahAngka();
     }
   };
   
   public void tambahAngka()
   {
       for(int i  = 0; i< 2000; i++)
       {
           x++; // x = x+1
       }
   }
   
    public static void main(String[] args) 
    {
        Kehilangan a = new Kehilangan();
       // a.tambahAngka();
       // a.tambahAngka();
        a.p.start();
        a.q.start();
        System.out.println("nilai x = "+a.x);
    }
}
