package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,"Please enter a message in the box.");
		try {
			FileWriter ww = new FileWriter("src/_01_File_Recorder/inputfile", true);
			ww.write(input);
			ww.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
