
package org.me.sharingData.gakjelas;



public class Kedua implements Runnable
{
    Bilangan a;

    public Kedua(Bilangan a) {
       
        this.a = a;
    }
    
    public Bilangan getMyAtomicInteger() {
        return a;
    }

    public void setMyAtomicInteger(Bilangan a) {
        this.a = a;
    }

    @Override
    public void run() 
    {
       a.kurangXnya();
    }
    
    
}
