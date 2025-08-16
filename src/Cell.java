    import java.awt.Dimension;
    import java.awt.Graphics;

    import javax.swing.JFrame;
    import javax.swing.JPanel;

    public class Cell {
        int cellSize;
        int cellX;
        int cellY;

        public Cell (int s, int x, int y){
            this.cellSize = s;
            this.cellX = x;
            this.cellY = y;
        }

        public void paint(Graphics g){
            g.drawRect(cellX, cellY, cellSize, cellSize);
            g.fillRect(cellX, cellY, cellSize, cellSize);
        }

    }
