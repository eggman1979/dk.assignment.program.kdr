package dk.assignment.program.ui.gui;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
	
	private final String TITLE = "Souldriven's Priority List";
	TodoPanel todo, done;
	
	
	public MainFrame() {
		setVisible(true);
		setTitle(TITLE);
		setSize(1900, 1000);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(300,300));
		System.out.println(getMinimumSize() + " MainFrame");
		
		
		todo = new TodoPanel("Todo List");
//		JLabel label = new JLabel("Test one");
//		label.setSize(todo.getWidth(), 30);
//		label.setBorder(BorderFactory.createLineBorder(Color.black,1));
//		todo.add(label);
		 done = new TodoPanel("Done List");
		done.setSize(new Dimension(300,400));
		add(todo);
		add(done);
	}
		
	
	
}
