package _02_File_Encrypt_Decrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public static void main(String[] args) {
		String cstring = "";
		String input = JOptionPane.showInputDialog(null,"Please enter a message in the box.");
		String key = JOptionPane.showInputDialog(null,"Please enter a key in the box.");
		int keyy = Integer.parseInt(key);
		
	try {
		FileReader fr = new FileReader("src/_02_File_Encrypt_Decrypt/encryption");
		int c = fr.read();
		while(c != -1){
			System.out.print((char)c);
			c = fr.read();
		}
		fr.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
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

}
	
}