
package org.me.carabuat;

public class MyThread extends Thread
{
   private int angka;

    public MyThread(int angka) 
    {
        this.angka = angka;
    }
   
    @Override
    public void run()
    {
        for(int i = 0; i< 5;i++)
        {
            System.out.println(angka++);
            istrahat(3000);
        }
    }
    
    public void istrahat(long milis)
    {
        try
        {
            Thread.sleep(milis);
        }
        catch(InterruptedException ie)
        {
        }
        
    }
    
}
