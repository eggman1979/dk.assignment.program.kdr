package dk.assignment.program.ui.gui;

import javax.swing.*;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import java.awt.*;

public class EntryLabel extends JLabel {
	
	String entryName;
	
	public EntryLabel(String entryName){
		super(entryName + " FUECH EM ALL");
		super.setBackground(new Color(250,100,100,100));
		setMaximumSize(new Dimension(300,30));
		setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
setOpaque(true);
		
		
	}
	
	
}
