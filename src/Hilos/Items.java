package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Items extends Thread {
    private int item;
    private JLabel nave;
    private JLabel it,tiempo;
    private String icono="";

    public Items(int item, JLabel nave,JLabel it,String icono) {
        this.item = item;
        this.nave = nave;
        this.it = it;
        this.icono = icono;
    }
    
    @Override
    public void run() {
        
        for (int i = 400; i>0; i--) {
            it.setLocation(i, it.getY());
            if (it.getX()== nave.getX() && it.getY() == nave.getY()) {
                switch (item) {
                    case 1:
                        int t=0;
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
            }
            try {
                sleep(70);
            } catch (InterruptedException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
