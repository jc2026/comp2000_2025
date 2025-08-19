import java.awt.*;

public class Animal {
    //Fields
    int row; //row
    int col; //col
    static int size = 35;
    static int offset = 10;


    public Animal (int x, int y){
        setPosition(x, y);
    }

    // Set the cell position
    public void setPosition (int x, int y){
        this.row = (int) Math.ceil((double)y/size);
        this.col = (int) Math.ceil((double)x/size);
        // if (x % size == 0){
        //     this.col = x/35;
        // } else {
        //     this.col = (int) x/35 +1;
        // } 
        // if (y % size == 0){
        //     this.row = y/35;
        // } else {
        //     this.row = (int) y/35 +1;
        //} 
    }

    // Draw a cell and fill colour
    public void paint(Graphics g){
        g.drawRect(offset + row*size, offset+col*size, size, size);
        g.setColor(Color.RED);
        g.fillRect(offset + row*size, offset+col*size, size, size);
    } 

}
