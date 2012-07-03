
package org.me.masalahdua;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver 
{
    Bilangan myBilangan = new Bilangan();
    
     Thread p = new Thread()
    {
        @Override
        public void run()
        {
            myBilangan.tambahXnya();
        }
    };
   Thread q = new Thread()
   {
        @Override
        public void run()
        {
            myBilangan.tambahXnya(); 
        }
   };
   
    public static void main(String[] args) 
    {
        Driver myDriver = new Driver();
        myDriver.p.start();
        myDriver.q.start();
        try {
            myDriver.p.join();
             myDriver.q.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Nilai bilangan = "+ myDriver.myBilangan.getX());
    }
}
