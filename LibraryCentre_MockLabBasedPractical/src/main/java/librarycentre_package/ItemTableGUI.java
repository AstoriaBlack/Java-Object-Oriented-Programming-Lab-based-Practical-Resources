/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author b.villarini
 */
public class ItemTableGUI extends JFrame {
    
    JTable myTable;
    ItemTableModel tableModel;
    ArrayList<Item> itemList;
    JPanel bottomPanel = new JPanel();
    
    // contructor
    public ItemTableGUI(ArrayList<Item> itemList){
        
        //set the title
        this.setTitle("Items in Westminster Library");
        
        // initialise and instantiate the instance variable 
        this.itemList = itemList;
        tableModel = new ItemTableModel(itemList);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panle
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        JButton button = new JButton("Info");
        JButton button2 = new JButton("Theme");

        ButtonHandler listener = new ButtonHandler();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        bottomPanel.addMouseListener(listener);


        bottomPanel.add(button);
        bottomPanel.add(button2);

        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private class ButtonHandler extends MouseAdapter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String btnLabel = e.getActionCommand();
            if(btnLabel.equals("Info")) {
            int bookCount = 0, dvdCount = 0, magazineCount = 0;

            for(Item item : itemList) {
                if(item instanceof Book) bookCount++;
                else if(item instanceof DVD) dvdCount++;
                else if(item instanceof Magazine) magazineCount++;

            }
                JOptionPane.showMessageDialog(null,"Books: " + bookCount +
                        "\nDVDs: " + dvdCount + "\nMagazines: " + magazineCount);

            } else if (btnLabel.equals("Theme")) {
                bottomPanel.setBackground(Color.PINK);
            }

        }
        public void mouseEntered(MouseEvent e) {
            bottomPanel.setBackground(Color.CYAN);
        }



    }


  
        
    
}
