package org.full.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Checked Exceptions using throws keyword

public class ExceptionHandler4 {

	static FileReader file = null;

	public static void read() throws IOException {

		int unicode = 0;	
		file = new FileReader("C:/Users/user.FULL276-WIN.000.001/Desktop/pki.txt");
		while ((unicode = file.read()) != -1) {
			System.out.print((char) unicode);
		}
	}
	
	public static void main(String[] args) {

		try {
			read();
		} catch (FileNotFoundException exception) {
			System.out.println("File Is Not Found In Specified Location");
			String message = exception.getMessage();
			System.out.println(message);
			exception.printStackTrace();
		} catch (IOException exception) {
			System.out.println("Input Stream Not Found");
			exception.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException exception) {
				System.out.println("Input Stream Not Found");
				exception.printStackTrace();
			}
		}
	}

}
