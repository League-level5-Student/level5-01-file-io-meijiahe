package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	public static void main(String[] args) {
	String cstring = "";
	String input = JOptionPane.showInputDialog(null,"Please enter a message in the box.");
	System.out.println(input);
	String key = JOptionPane.showInputDialog(null,"Please enter a key in the box.");
	int keyy = Integer.parseInt(key);
	char [] chars = input.toCharArray();
	for (char c: chars) {
		if (c!=32) {
			c+=keyy;
		}
		if (!Character.isLetter(c)&&c!=32) {
			c-=26;
		}
		cstring += c;
	}
	System.out.println(cstring);

	try {
		FileWriter ww = new FileWriter("src/_02_File_Encrypt_Decrypt/encryption", true);
		ww.write(cstring);
		ww.close();
		
	} catch(IOException e) {
		e.printStackTrace();
	}
}
}
