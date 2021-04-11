
package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Tiempo extends Thread{
    private int time;
    private JLabel tiempo;
    public Tiempo(int time,JLabel tiempo) {
        this.time = time;
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        for (int i = time; i>0; i--) {
            tiempo.setText(i+" s");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
