package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
    JButton addtask = new JButton("add task");
	JButton viewtask = new JButton("view task");
	JButton removetask = new JButton("remove task");
	JButton savelist = new JButton("save list");
	JButton loadlist = new JButton("load list");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	String useranswer ="";
	ArrayList<String> str = new ArrayList<String>();
	Clicklistener click = new Clicklistener();
	public static void main(String[] args) {
		ToDoList tdl = new ToDoList();
	}
	

	public ToDoList() {
		addtask.addActionListener(click);
		viewtask.addActionListener(click);
		removetask.addActionListener(click);
		savelist.addActionListener(click);
		loadlist.addActionListener(click);
		panel.add(frame);
		frame.add(addtask);
		frame.add(viewtask);
		frame.add(removetask);
		frame.add(savelist);
		frame.add(loadlist);
		
	}
	
private class Clicklistener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addtask)
	      {
	    useranswer =JOptionPane.showInputDialog(null,"What is task?");
	     str.add(useranswer);
	      }
		if (e.getSource() == viewtask)
	      {
			String alltasks = "";
	    for (int i =0;i<str.size();i++) {
	    	alltasks+=str.get(i);
	    	//collect all tasks and put into a string then show message dialog to show all the tasks
	    }
	    JOptionPane.showMessageDialog(null,alltasks);
	      }
	}
}
}
