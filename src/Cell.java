import java.awt.*;

class Cell {
    //fields
    int x;
    int y;
    static int size = 35;

    //constructor
    public Cell(int x, int y){
        this.x = x; 
        this.y = y;
    }

    //methods
    void paint (Graphics g, Point mousePos){
        if (contains(mousePos)){
            g.setColor(Color.GRAY);
        }else{
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,35,35);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,35,35);
    }
    
    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        }else{
            return false;
        }
    }
}
