
package org.me.sharingData.gakjelas;



public class Pertama implements Runnable
{
    Bilangan a;

    public Pertama(Bilangan a) {
        this.a = a;
    }
    
    public Bilangan getMyAtomicInteger() {
        return a;
    }

    public void setMyAtomicInteger(Bilangan a) {
        this.a = a;
    }

    @Override
    public void run() {
        a.tambahXnya();
    }
    
    
}
