import java.awt.*;

public class Animal {
    //Fields
    int x; //row
    int y; //col
    static int size = 35;


    public Animal (int x, int y){
        this.x = x;
        this.y = y;
    }

    // locate a cell and fill colour
   public void paint(Graphics g, int x, int y){
        g.drawRect(x,y,size,size);
        g.setColor(Color.RED);
        g.fillRect(x, y, size, size);
        
    } 

}
