package personproject;

import javax.swing.*;
import java.util.ArrayList;

public class PersonTable extends JFrame {

    JTable myTable;
    PersonTableModel tableModel;
    ArrayList<Person> list;

    //constructor
    public PersonTable(ArrayList<Person> list) {
        // initialise and instantiate the instance variable
        super("Person Table");
        this.list = list;
        // create an instance of PersonTableModel
        tableModel = new PersonTableModel(list);
        // create an instance of JTable and link the model to the table
        myTable = new JTable(tableModel);
        myTable.getColumnModel().getColumn(2).setCellRenderer(new PersonTypeRenderer());

        //sortable columns here
        //It doesn't touch your actual ArrayList<Person> or
        // reorder your data — it just changes what order the view displays rows in,
        myTable.setAutoCreateRowSorter(true);
        // set the size of the frame
        setSize(500,300);
//        myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        myTable.setSize(600, 400);
        //do the setting size on frame itself, not on table

        // instantiate a JSCrollPane and add the table BorderLayout as default
        // JScrollPane gives you the header row + scrollbars for free.
        // A bare JTable with no scroll pane won't even show its headers.
        JScrollPane scrollPane = new JScrollPane(myTable);
        add(scrollPane);// BorderLayout.CENTER is the default region for add()
    }
}
