package dk.assignment.program.ui.gui;

import javax.swing.*;
import java.awt.*;


public class TodoPanel extends JPanel {
	
	JLabel entryPanel;
	
	
	public TodoPanel(String panelName){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		entryPanel = new JLabel(panelName);
		entryPanel.setMaximumSize(new Dimension(100,30));
		setVisible(true);
		setBackground(Color.WHITE);
		add(entryPanel);
		setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		super.setSize(100,30);
		super.setMaximumSize(new Dimension(300,500));
		addEntryLabel(new EntryLabel("THis"));
	}
	
	public void addEntryLabel(EntryLabel label){
		add(label);
	}
	
}
