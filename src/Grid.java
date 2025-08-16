import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel{
    int rows;
    int cols;
    int cellSize;
    Cell[][] cells;

    public Grid (int s, int r, int c){
        this.cellSize = s;
        this.rows = r;
        this.cols = c;
        this.cells = new Cell[r][c];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                cells[i][j] = new Cell (cellSize,j*cellSize,i*cellSize);
            }
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                cells[i][j].paint(g);
            }
        }
    }

}


