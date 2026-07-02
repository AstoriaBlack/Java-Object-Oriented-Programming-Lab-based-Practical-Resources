package calculator;

import java.awt.*; //gives layout classes
import javax.swing.*; //gives actual visual components

public class CalculatorFrame extends JFrame{

    private JTextField display;

    //// Constructor to set up UI component
    public CalculatorFrame() {
        super("My Calculator"); //sets the window's title bar text


        // ---- Frame's own layout: BorderLayout ----
        // Splits the window into NORTH / SOUTH / EAST / WEST / CENTER zones.
        //we only need NORTH for the display, CENTER for everything else
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);

        //p1-red box (digit pad)
        JPanel p1 = new JPanel(new GridLayout(4, 3));

        String[] digitLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "."};
        for (String label : digitLabels) {
            p1.add(new JButton(label));
        }

        //P2 - the operators (green box)
        JPanel p2 = new JPanel(new GridLayout(4, 1));
        String[] opLabels = {"+", "-", "Clear"};
        for (String label : opLabels) {
            p2.add(new JButton(label));
        }

        //P3 combine P1 and P2 side by side
        JPanel p3 = new JPanel(new GridLayout(1, 2));
        p3.add(p1);
        p3.add(p2);

        add(p3, BorderLayout.CENTER);
    }
}
