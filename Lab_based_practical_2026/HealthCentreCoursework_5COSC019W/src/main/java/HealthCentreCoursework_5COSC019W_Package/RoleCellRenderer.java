package HealthCentreCoursework_5COSC019W_Package;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

import static java.awt.Color.blue;

public class RoleCellRenderer extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);

        if(!isSelected) {
            if ("Doctor".equals(value)) {
                cell.setBackground(new Color(100,100,255));
            } else if ("Receptionist".equals(value)) {
                cell.setBackground(new Color(100,255,100));
            }else if ("Nurse".equals(value)) {
                cell.setBackground(new Color(255,100,200));
            }else {
                cell.setBackground(Color.WHITE);
            }
        }
        return cell;
    }

}
