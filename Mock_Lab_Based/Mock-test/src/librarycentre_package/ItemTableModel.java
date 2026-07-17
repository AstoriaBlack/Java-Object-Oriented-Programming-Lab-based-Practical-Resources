package librarycentre_package;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ItemTableModel extends AbstractTableModel {
    private String[] columnNames = {"Title", "ISBN", "Year", "Type"};
    ArrayList<Item> itemList;

    public ItemTableModel(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public int getRowCount() {
        return itemList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        Item item = itemList.get(rowIndex);

        if (columnIndex == 0) {
            temp = item.getTitle();
        } else if (columnIndex == 1) {
            temp = item.getISBN();
        }else if (columnIndex==2) {
            temp = item.getPublicationYear();
        }else if (columnIndex==3) {
            if(item instanceof Book) temp = "BOOK";
            else if(item instanceof DVD) temp = "DVD";
            else if(item instanceof Magazine) temp = "MAGAZINE";
        }
        return temp;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
