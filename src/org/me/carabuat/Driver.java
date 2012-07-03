
package org.me.carabuat;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Driver 
{
    public static void main(String[] args) 
    {
        MyThread a = new MyThread(3);
        a.start();
        
        MyThreadImple as = new MyThreadImple();
        Thread myThr = new Thread(as);
        myThr.start();
        try {
            a.join();
            myThr.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Main Beres");
    }
}
