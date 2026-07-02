package microwave;

import java.awt.*;
import javax.swing.*;

public class MicrowaveFrame extends JFrame {

    public MicrowaveFrame() {
        //creating panel p1 for the buttons and set GridLayout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));

        //add buttons to the panel
        for(int i = 1; i <=9; i++) {
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("0"));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        //creates a panel p2 to hold a text field and p1
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        //add contents to the frame
        add(p2, BorderLayout.EAST);
        add(new JButton("Food to be placed here"));
    }

    public static void main(String[] args) {
        MicrowaveFrame f = new MicrowaveFrame();
        f.setTitle("Microwave oven front view");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
