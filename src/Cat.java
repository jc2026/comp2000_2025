import java.awt.*;

public class Cat  extends Animal{
    public Cat (int x, int y){
        super (x, y);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(offset + row*size, offset+col*size, size, size);
        g.setColor(Color.BLUE);
        g.fillRect(offset + row*size, offset+col*size, size, size);
    } 
    
}
