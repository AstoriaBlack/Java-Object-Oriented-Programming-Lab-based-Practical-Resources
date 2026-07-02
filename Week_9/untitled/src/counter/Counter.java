package counter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Counter extends JFrame {
    private JLabel lblCount;
    private JTextField tfCount; //just textbox displaying data from count
    private JButton btnCount;
    private JButton btnCountDown;
    private JButton btnReset;
    private int count = 0;
    // the actual counter value, lives independently of what's shown on screen

    //the constructor
    public Counter() {
        super("Counter");

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

    /*Slightly different from CalculatorFrame —
    here we grab the frame's content pane explicitly via
    getContentPane(), then call setLayout/add on that,
    instead of calling them directly on this. Functionally
    near-identical (calling add(...) directly on a JFrame
    actually delegates to its content pane behind the scenes anyway)
    — this is just the more explicit, "correct" way of writing it.
     */
        lblCount = new JLabel("Counter");
        cp.add(lblCount);

        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        btnCount = new JButton("Count");
        cp.add(btnCount);

        //new buttons
        btnCountDown = new JButton("Count Down");
        cp.add(btnCountDown);

        btnReset = new JButton("Reset");
        cp.add(btnReset);

        /*This is the step people most often forget.
        Writing the MyListener class doesn't connect it to anything by itself
        — addActionListener(handler) is what tells btnCount "when you get clicked,
        call handler's actionPerformed method." Without this line, your listener class
        just sits there unused, and clicking does nothing.
         */

        MyListener handler = new MyListener();
        btnCount.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnReset.addActionListener(handler);
    }

        //Inner class -> can directly read/write the private fields above (count, tfCount)
        /*Why is this class written inside Counter? (an "inner class"), instead of its own separate file?
        Because it needs direct access to count and tfCount,
        which are private fields of Counter. An inner class is
        treated as "part of" the outer class, so it can freely
        read/write those private fields — a completely separate
        class couldn't, without you writing getters/setters for everything.
        */
//part one - simpler version
//    private class MyListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent evt) {
//            ++count;
//            tfCount.setText(count + "");
//        }
//    }
    //The concept here is: instead of one listener class
        // per button, all three buttons share the same
        // listener, and inside actionPerformed we ask
        // "which button actually fired this?" using
        // evt.getSource(). That returns the exact object that triggered the event
        // — so we compare it against our button references with ==.
    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // evt.getSource() tells us exactly which button fired this event,
            // since all three share this one listener.
            if (evt.getSource() == btnCount) {
                ++count;
            } else if (evt.getSource() == btnCountDown) {
                --count;
            } else if (evt.getSource() == btnReset) {
                count = 0;
            }
            tfCount.setText(count + "");// one update, covers all three cases
        }
    }

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        myCounter.setSize(300,100);
        myCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCounter.setVisible(true);
    }
}
