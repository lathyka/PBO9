
package org.me.carabuat;

import javax.swing.JOptionPane;

public class MyThreadImple implements Runnable
{

    @Override
    public void run() 
    {
        String nama = JOptionPane.showInputDialog(null,"Masukkan angka");
        JOptionPane.showMessageDialog(null, nama);
    }
    
}
