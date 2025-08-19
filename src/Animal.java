import java.awt.*;

public class Animal {
    //Fields
    int row; //row
    int col; //col
    static int size = 35;
    static int offset = 10;


    public Animal (int x, int y){
        this.row = (int) Math.ceil((double)y/size);
        this.col = (int) Math.ceil((double)x/size);
    }
    

    // locate a cell and fill colour
   public void paint(Graphics g){
        g.drawRect(offset + row*size, offset+col*size, size, size);
        g.setColor(Color.RED);
        g.fillRect(offset + row*size, offset+col*size, size, size);
    } 

}
