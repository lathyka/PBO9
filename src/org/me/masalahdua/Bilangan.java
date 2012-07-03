
package org.me.masalahdua;


public class Bilangan 
{
    private int  x = 0;

    public int getX() {
        return x;
    }

   public  void  tambahXnya()
   {
       for(int  i = 0; i<2000;i++)
       x++;
   }
   
    public synchronized  void  tambahXnyaSecaraSinkronasi()
   {
       for(int  i = 0; i<2000;i++)
       x++;
   }
    
    
}
