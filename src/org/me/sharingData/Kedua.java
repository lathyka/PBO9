
package org.me.sharingData;

import java.util.concurrent.atomic.AtomicInteger;

public class Kedua implements Runnable
{
    AtomicInteger myAtomicInteger;

    public Kedua(AtomicInteger myAtomicInteger) {
       
        this.myAtomicInteger = myAtomicInteger;
    }
    
    public AtomicInteger getMyAtomicInteger() {
        return myAtomicInteger;
    }

    public void setMyAtomicInteger(AtomicInteger myAtomicInteger) {
        this.myAtomicInteger = myAtomicInteger;
    }

    @Override
    public void run() 
    {
       for(int i = 0; i<20;i++)
       {
           System.out.println("Mengurangi sekarang menjadi ="+myAtomicInteger.decrementAndGet());
       }
    }
    
    
}
