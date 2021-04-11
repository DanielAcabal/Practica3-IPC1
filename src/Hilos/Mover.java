/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Ventanas.NuevaPartida;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mover extends Thread {

    private JLabel bala;
    private int posicion, puntos, contador = 0;
    private JPanel panel1;
    private JLabel nave, labelpuntos;
    private ArrayList<JLabel> alien1;

    @Override
    public void run() {
        for (int i = 20; i < 700; i++) {
            bala.setLocation(i, posicion);
            for (int j = 0; j < alien1.size(); j++) {
                if (i > alien1.get(j).getX()) {
                    if (posicion > alien1.get(j).getY() - 13 && posicion < alien1.get(j).getY() + 13) {

                        if (Integer.parseInt(alien1.get(j).getText()) == 4) {
                            alien1.get(j).setText("3");
                            panel1.remove(bala);
                            stop();
                        } else if (Integer.parseInt(alien1.get(j).getText()) == 3) {
                            alien1.get(j).setText("2");
                            panel1.remove(bala);
                            stop();
                        } else if (Integer.parseInt(alien1.get(j).getText()) == 2) {
                            alien1.get(j).setText("1");
                            panel1.remove(bala);
                            stop();
                        } else {
                            alien1.get(j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/explosion.png")));

                            try {
                                sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            panel1.remove(alien1.get(j));
                            alien1.get(j).setEnabled(false);
                            panel1.remove(bala);
                            stop();
                        }
                    }
                }
            }
            try {
                sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        panel1.remove(bala);
        //panel1.updateUI();
        // nave.setLocation(10,);

    }

    public Mover(JLabel bala, int posicion, JPanel panel1, JLabel nave, ArrayList<JLabel> alien1, int puntos, JLabel lblpuntos) {
        this.bala = bala;
        this.posicion = posicion;
        this.panel1 = panel1;
        this.nave = nave;
        this.alien1 = alien1;
        this.puntos = puntos;
        this.labelpuntos = lblpuntos;
    }
}
