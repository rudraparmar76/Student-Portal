/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colleges.Bhagubhai_College;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
/**
 *
 * @author rudra
 */
public class HyperlinkCellRenderer extends DefaultTableCellRenderer{
    private static final Color LINK_COLOR = Color.BLUE;
    private static final Cursor HAND_CURSOR = new Cursor(Cursor.HAND_CURSOR);
     public HyperlinkCellRenderer() {
        setForeground(LINK_COLOR);
        setCursor(HAND_CURSOR);
    }
     @Override
    protected void setValue(Object value) {
        setText("<html><u>" + value + "</u></html>");
    }
}
