import java.applet.Applet;
import java.awt.*;
import javax.swing.JFrame;

public class BouncingBall extends Applet implements Runnable {

    int x = 50, y = 50;
    int dx = 2, dy = 2;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;

            if (x <= 0 || x >= getWidth() - 30)
                dx = -dx;
            if (y <= 0 || y >= getHeight() - 30)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(20);
            } catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
    }

    // Add this main method to run as an application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall ball = new BouncingBall();
        frame.add(ball);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ball.init();  // Initialize the applet
    }
}