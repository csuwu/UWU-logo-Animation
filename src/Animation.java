
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cst15008
 */
public class Animation extends Applet implements Runnable{


    public void init() {
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void paint(Graphics g) {
        drawSun(g,i);
        drawLeaf(g,i);
        drawMountain(g);
        
        drawLetters(g,i);
        drawWind(g,i);
    }

    int i;

    @Override
    public void run() {
        for (i = 0; i < 1000; i += 3) {

            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void drawMountain(Graphics g) {////////////////////////////////////////////////mountain
    
        int x[] = {100, 250, 170};
        int y[] = {180, 180, 55};
        g.setColor(new Color(193, 193, 193));
        g.fillPolygon(x, y, 3);

      
        // g.fillOval(240, 120, 20, 100);

    }
    
        public void drawLetters(Graphics g,int x) {//////////////////////////////////////////Letters
        
              
        Font f = new Font("Arial", Font.BOLD, 60);
        g.setFont(f);
         g.setColor(new Color(228, 118, 21));  
  
        if(x<280){
        g.drawString("UWU", x/2-100, 180); 
        }else{
        g.drawString("UWU", 40, 180); 
        }
        
        
        }
            public void drawWind(Graphics g,int x) {//////////////////////////////////////////////wind
      
        
        if(x<200){
               g.setColor(Color.BLUE);
        int x2[] = {220-x, 370-x, 440-x, 360-x, 340-x};
        int y2[] = {80, 110, 180, 120, 120};
        g.fillPolygon(x2, y2, 5);
        }
        else{
              g.setColor(Color.BLUE);
        int x2[] = {20, 170, 240, 160, 140};
        int y2[] = {80, 110, 180, 120, 120};
        g.fillPolygon(x2, y2, 5);
        }
        
            }
        

    public void drawLeaf(Graphics g,int x) {//////////////////////////////////////////////////Leafs
    
         
        if(x<50){
        
              g.setColor(new Color(24, 124, 60)); //leaf
        g.fillOval(120+x, 160, 100, 20);
        
        
        g.setColor(new Color(24, 124, 60));
         int x1[] = {190+x, 200+x, 200+x, 180+x, 180+x};
        int y1[] = {130, 150, 180, 160, 140};
        g.fillPolygon(x1, y1, 5);
            
        }else{
        
        g.setColor(new Color(24, 124, 60)); //leaf
        g.fillOval(170, 160, 100, 20);
        
        
        g.setColor(new Color(24, 124, 60));
         int x1[] = {240, 250, 250, 230, 230};
        int y1[] = {130, 150, 180, 160, 140};
        g.fillPolygon(x1, y1, 5);
        }
   
    }
    
    public void drawSun(Graphics g, int x) {////////////////////////////////////////////////SUN
     
        
        if(x<180){
           g.setColor(new Color(254, 245, 4));     //sun
        g.fillOval(130, 105-x/2, 80, 80);
        g.setColor(new Color(228, 118, 21));    //ornge
        g.fillOval(145, 120-x/2, 50, 50);
        }else{
           g.setColor(new Color(254, 245, 4));     //sun
        g.fillOval(130, 15, 80, 80);
        g.setColor(new Color(228, 118, 21));    //ornge
        g.fillOval(145, 30, 50, 50);
        
        }

    }


 


}
