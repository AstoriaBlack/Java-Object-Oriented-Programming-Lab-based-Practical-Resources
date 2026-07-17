package librarycentre_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ItemTableGUI extends JFrame {
    JTable myTable;
    ItemTableModel tableModel;
    ArrayList<Item> itemList;

    public ItemTableGUI(ArrayList<Item> itemList) {
        //set the title
        this.setTitle("Library Manager Item Table");

        this.itemList = itemList;
        tableModel = new ItemTableModel(itemList);
        myTable = new JTable(tableModel);

        setBounds(20,20,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myTable.setAutoCreateRowSorter(true);

        JScrollPane scroll = new JScrollPane(myTable);
        scroll.setPreferredSize(new Dimension(380,280));

        JButton button = new JButton("Info");
        JLabel infoLabel = new JLabel("Click to info to see the item count!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                int bookCount = 0, dvdCount = 0, magazineCount = 0;
                for (Item item : itemList) {
                    if(item instanceof Book) bookCount++;
                    else if(item instanceof DVD) dvdCount++;
                    else if(item instanceof Magazine) magazineCount++;
                }
//                JOptionPane.showMessageDialog(null,
//                        "Books: " + bookCount + "\nDVDs: " + dvdCount +
//                        "\nMagazines: " + magazineCount);
                infoLabel.setText("Books: " + bookCount + " | DVDs: "
                + dvdCount + " | Magazines: " + magazineCount);

            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(button);
        bottomPanel.add(infoLabel);


        add(scroll,BorderLayout.CENTER);
//        add(button,BorderLayout.SOUTH);
        add(bottomPanel,BorderLayout.SOUTH);

    }
}
