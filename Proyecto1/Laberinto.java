
package Proyecto1;

import java.awt.Color;
import java.awt.Graphics;


public class Laberinto {
    private int fila = 0;
    private int columna = 0;
    private final int NFilas = 10;
    private final int NColumnas = 10;
    private final int ABloque = 40;
    private final int LBloque = 40;
    
     public void paint(Graphics grafico){
         int [][] laberinto = laberinto();
         
         for(fila = 0; fila < NFilas; fila++){
             for(columna = 0; columna < NColumnas; columna++){
                 if(laberinto[fila][columna] == 1){
                     grafico.setColor(Color.blue);
                     grafico.fillRect(columna*40, fila*40, ABloque, LBloque);
                     grafico.setColor(Color.black);
                     grafico.drawRect(columna*40, fila*40, ABloque, LBloque);
                 
                 }
             }
         }
     }
     
    public int [][] laberinto(){
        int laberinto[][] = {{1,1,1,1,1,1,0,1,1,1},
                             {1,0,1,0,0,0,0,0,0,1},
                             {1,0,0,0,1,0,0,1,0,1},
                             {1,1,1,1,0,0,1,1,1,1},
                             {1,0,0,0,0,1,0,0,0,1},
                             {1,0,1,1,1,1,0,1,0,1},
                             {1,0,0,0,0,1,0,1,0,1},
                             {1,1,0,1,1,1,0,1,0,1},
                             {1,0,0,0,0,0,0,1,0,1},
                             {1,1,1,1,1,1,1,1,0,1}
                            };
    
    
    return laberinto;
    } 
}
