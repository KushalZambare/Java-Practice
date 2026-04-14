import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class extending JFrame
public class SwingExample extends JFrame implements ActionListener {

    JButton btnEnable, btnDisable;

    // Constructor
    SwingExample() {

        // Set layout
        setLayout(new FlowLayout());

        // Create buttons
        btnEnable = new JButton("Enable");
        btnDisable = new JButton("Disable");

        // Add buttons to frame
        add(btnEnable);
        add(btnDisable);

        // Add action listener
        btnEnable.addActionListener(this);
        btnDisable.addActionListener(this);

        // Frame settings
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Drawing shapes
    public void paint(Graphics g) {

        super.paint(g);

        // Draw circle
        g.drawOval(150, 150, 100, 100);

        // Draw waveform (simple zig-zag line)
        g.drawLine(50, 300, 100, 250);
        g.drawLine(100, 250, 150, 300);
        g.drawLine(150, 300, 200, 250);
        g.drawLine(200, 250, 250, 300);
    }

    // Button actions
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnEnable) {

            btnDisable.setEnabled(true);
            btnEnable.setEnabled(false);
        }

        if (e.getSource() == btnDisable) {

            btnEnable.setEnabled(true);
            btnDisable.setEnabled(false);
        }
    }

    public static void main(String[] args) {

        new SwingExample(); // Create object
    }
}