
package org.me.sharingData.gakjelas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver
{
    public static void main(String[] args) 
    {
        Bilangan a= new Bilangan();
        Pertama pertama = new Pertama(a);
        Kedua kedua = new Kedua(a);
        Thread satu = new Thread(pertama,"ini thread tambah");
        Thread dua = new Thread(kedua,"ini thread kurang");
        satu.start();
        dua.start();
        try {
            satu.join();
            dua.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pada Akhirnya = "+a.getX());
        
    }
}
