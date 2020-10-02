package org.full.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Checked Exceptions using try and catch

public class ExceptionHandler3 {

	public static void main(String[] args) {
		int unicode = 0;
		FileReader file = null;
		try {
			file = new FileReader("C:/Users/user.FULL276-WIN.000.001/Desktop/python.txt");
			while ((unicode = file.read()) != -1) {
				System.out.print((char) unicode);
			}
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
				// e.printStackTrace();
			}
		}

	}

}
