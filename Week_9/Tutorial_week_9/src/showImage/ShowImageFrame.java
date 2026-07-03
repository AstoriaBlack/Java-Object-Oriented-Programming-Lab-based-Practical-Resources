package showImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowImageFrame extends JFrame {
    private JButton btnOne;
    private JButton btnTwo;
    private JLabel lblImage;

    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;

    public ShowImageFrame() {
        Container cp = getContentPane();
        //set layout in the main panel
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.blue);

        //create a panel with two buttons in a grid
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        //create and add buttons
        btnOne = new JButton("One");
        p1.add(btnOne);

        btnTwo = new JButton("Two");
        p1.add(btnTwo);

        //create a label with a default image
        imageIconZero = new ImageIcon((getClass().getResource("images/zero.png")));
        //We pass the ImageIcon object as argument to JLabel constructor
        lblImage = new JLabel(imageIconZero,JLabel.CENTER);

        //add the jlabel on the top
        cp.add(lblImage, BorderLayout.CENTER);

        //add the button on the bottom
        cp.add(p1, BorderLayout.SOUTH);

        //instantiate the other two images
        imageIconOne = new ImageIcon(getClass().getResource("images/one.png"));
        imageIconTwo = new ImageIcon(getClass().getResource("images/two.png"));

        //add event handler
        //we add an action listener to button One and button Two
        MyListener myListener = new MyListener();
        btnOne.addActionListener(myListener);
        btnTwo.addActionListener(myListener);
        //we add a mouse listener to the JLabel
        lblImage.addMouseListener((myListener));

    }
    private class MyListener extends MouseAdapter implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
            //event.getActionCommand() returns the button's label
            if (btnLabel.equals("One")) {
                lblImage.setIcon(imageIconOne);
            }else if (btnLabel.equals("Two")) {
                lblImage.setIcon(imageIconTwo);
            }
        }
        //this will make zero image display when the mouse click anywhere else
        public void mouseClicked(MouseEvent evt) {
            lblImage.setIcon(imageIconZero);
        }
    }

    public static void main(String[] args)  {
// Invoke the constructor by allocating an anonymous instance
        ShowImageFrame myFrame = new ShowImageFrame();
        myFrame.setSize(600, 400);       // "super" Frame sets initial size
        myFrame.setTitle("My Frame");           // "super" Frame sets title
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);                  // show "super" Frame
    }

}



