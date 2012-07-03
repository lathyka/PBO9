
package org.me.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver 
{
    ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(10); 
   
    
    public  void konsumen() throws InterruptedException
    {
        new Thread()
        {
            @Override
            public void run()
            {
                try {
                    for(int i = 0; i<20;i++)
                    {
                         System.out.println(a.take()+ "dan sekarang isi dari array "+a.size());
                         Thread.sleep(1000);
                    }
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
        
    }
    
    public void produsen() throws InterruptedException
    {
        new Thread()
        {
            public void run()
            {
                try {
                    for(int i = 0; i<30;i++)
                    {
                         a.put(new Integer(5));
                         System.out.println("Dariprodusen menambahkan sekarang isi dari array "+a.size());
                         Thread.sleep(700);
                             
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }.start();
       
    }
    
    
    public static void main(String[] args) throws InterruptedException 
    {
        Driver myDriver = new Driver();
        myDriver.produsen();
        myDriver.konsumen();
    }

}


