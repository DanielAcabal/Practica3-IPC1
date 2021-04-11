/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class Aliens extends Thread{
    private ArrayList<JLabel> alien1;
    private JLabel nave;
    private int posx,posy=-1;

        public Aliens(ArrayList<JLabel> alien1,int posx) {
        this.alien1 = alien1;
        this.posx = posx;
    }   
        public Aliens(ArrayList<JLabel> alien1,int posx,JLabel nave) {
        this.alien1 = alien1;
        this.posx = posx;
        this.nave = nave;
    }
    
    public void run(){
        for (int i = 700; i>10; i--) {
            for (int j = 0; j < alien1.size(); j++) {
                if (i<600 && i>500){
                   alien1.get(j).setLocation(i+posx,alien1.get(j).getY()+posy);
                }   else if (i<500&& i>400){
                   alien1.get(j).setLocation(i+posx,alien1.get(j).getY()-posy);
                }else if (i<400 && i>300){
                   alien1.get(j).setLocation(i+posx,alien1.get(j).getY()+posy);
                }else if (i<300 && i>200){
                   alien1.get(j).setLocation(i+posx,alien1.get(j).getY()-posy);
                }else if (i<200 && i>100){
                   alien1.get(j).setLocation(i+posx,alien1.get(j).getY()+posy);
                }  
                else{
                alien1.get(j).setLocation(i+posx,alien1.get(j).getY()-posy);
                }
            //alien1.get(j).setLocation(i+posx,alien1.get(j).getY());    
            }
            try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Aliens.class.getName()).log(Level.SEVERE, null, ex);
                }
            if(i==11){
                stop();
                
            JOptionPane.showMessageDialog(null, "Juego finalizado");
            }
        }
    }
}
