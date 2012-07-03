
package org.me.maslahnya;

import javax.swing.JOptionPane;


public class PemecahanMasalan 
{
     public static void main(String[] args) {
       // print();
        new Thread()
        {
            @Override
            public void run()
            {
                 cetak();
            }
        }.start();
        new Thread()
        {
            @Override
            public void run()
            {
                 print();
            }
        }.start();
       
       
    }
    
    public static void cetak()
    {
       String data =  JOptionPane.showInputDialog(null,"masukkan angka");
        System.out.println(data);
    }
    public static void print()
    {
        for(int i = 0; i< 20;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ie)
            {
            }
        }
    }
}
