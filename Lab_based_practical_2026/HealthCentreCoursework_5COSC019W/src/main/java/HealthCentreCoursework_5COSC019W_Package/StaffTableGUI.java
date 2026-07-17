/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentreCoursework_5COSC019W_Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class StaffTableGUI extends JFrame {
    
    JTable myTable;
    StaffTableModel tableModel;
    ArrayList<StaffMember> list;
    
    // contructor
    public StaffTableGUI(ArrayList<StaffMember> list){
        
        //set the title
        this.setTitle("Staff in Westminster Health Centre");
        
        // initialise and instantiate the instance variable 
        this.list = list;
        tableModel = new StaffTableModel(list);
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
        JButton button = new JButton("Statistics");

        ButtonHandler listener = new ButtonHandler();
        button.addActionListener(listener);
        
        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
        
        
        
    }

    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Doctor doctorCount = null;
            ArrayList<Doctor> doctorArray = new ArrayList<Doctor>();
            for (StaffMember staffMember : list) {
                if(staffMember instanceof Doctor) {
                    doctorArray.add((Doctor) staffMember);
                }
            }
            for (Doctor doctor : doctorArray) {
                for (Doctor doctor1 : doctorArray) {
                    if (doctor.getNumberConsultationsperWeek() > doctor1.getNumberConsultationsperWeek()) {
                        doctorCount = doctor;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Doctor with most consultations per week: "
            + doctorCount);
        }
    }
    
}
