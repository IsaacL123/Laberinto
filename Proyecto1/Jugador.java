
package Proyecto1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Jugador {
    Laberinto lab = new Laberinto();
    
    private int x = 240;
    private int y = 0;
    private final int ancho = 40;
    private final int alto = 40;
    private final int Movimiento = 40;
    
    
     public void paint(Graphics grafico){
       
         grafico.setColor(Color.yellow);
         grafico.fillOval(x, y, ancho, alto);
         grafico.setColor(Color.black);
         grafico.drawOval(x, y, ancho, alto);
         
     }
     
     public void teclaPresionada(KeyEvent e){
         int [] [] laberinto = lab.laberinto();
         
         if(e.getKeyCode() == 37){   //Izq
             if(laberinto [y/40][(x/40)-1] != 1){
                  x = x - Movimiento;
            }
         }
         
         if(e.getKeyCode() == 39){   //der
            if(laberinto [y/40][(x/40)+1] != 1){
                  x = x + Movimiento;
             }
         } 
         
         if(e.getKeyCode() == 40){   //abajo
           if(laberinto [(y/40) + 1][x/40] != 1){
                  y = y + Movimiento;
             }    
         } 
         
         if(e.getKeyCode() == 38){   //arriba
            if(laberinto [(y/40) - 1][x/40] != 1){
                  y = y - Movimiento;
            }
         } 
         
         if(x == 320 && y == 360){
             JOptionPane.showMessageDialog(null,"FIN DEL JUEGO");
             System.exit(0);
         }
     }
}