package koko;
import java.awt.*;


public class xx extends Frame{
    public static void main(String[] args) {
        
        drawClock(1,2,3,4,5,120);
    }
    
    public void drawClock(int ox, int oy, int x, int y, int l, int angle) {
        x = ox + (int)(l*Math.sin(angle*Math.PI/180));
        y = oy - (int)(l*Math.cos(angle*Math.PI/180));

        g.drawLine(ox, oy, x, y);
       }
    
}
