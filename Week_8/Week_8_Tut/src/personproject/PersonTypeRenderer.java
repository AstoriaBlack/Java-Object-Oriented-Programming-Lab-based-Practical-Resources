package personproject;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JTable;

public class PersonTypeRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        // Let the default renderer build the normal JLabel first —
        // we're not replacing the rendering, just tweaking its color.
        Component c = super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);

        // 'value' here is whatever getValueAt(row, col) returned for this cell —
        // in our case, the String "Teacher" or "Student".
        if ("Teacher".equals(value)) {
            c.setBackground(Color.GREEN);
        } else if ("Student".equals(value)) {
            c.setBackground(Color.CYAN); // Color.BLUE is quite dark/hard to read text on
        } else {
            c.setBackground(Color.WHITE); // fallback, avoids weird leftover colours
        }

        return c;
    }
}