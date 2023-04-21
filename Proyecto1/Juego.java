
package Proyecto1;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Juego extends JPanel{
    Laberinto laberinto = new Laberinto();
    Jugador jugador = new Jugador();
    
    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
        jugador.paint(grafico);
      
       
    }
    
    public Juego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                jugador.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
            
        });
        setFocusable(true);
    }
    
    
    
    
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Laberinto");
        Juego juego = new Juego();
        ventana.add(juego);
        ventana.setVisible(true);
        ventana.setSize(420,440);
        ventana.setLocation(500, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            juego.repaint();
        }
    }
    
}
