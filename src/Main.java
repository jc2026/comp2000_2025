import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(10, 10, 700, 700);
        g.drawRect(10, 10, 700, 700);
        //int startX = 10;
        //int startY = 10;
        
        for (int i = 0; i <= 700/35; i++){
          g.drawLine(10 + 35*i, 10, 10 + 35*i, 710);
          g.drawLine(10, 10 + 35*i, 710,  + 10+35*i);
        } 
      }
    }
    

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
