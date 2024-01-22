package io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {

		FileReader reader = null;
		
		FileWriter writer = null;

		try {
			// FileInputStream reader = new FileInputStream("resources/Input.txt");
			
			writer = new FileWriter("resources/Output.txt");  // writing to output file

			reader = new FileReader("resources/Input.txt");// reading from input file

			int n = 0;

			while ((n = reader.read()) != -1) {

				System.out.print((char) n);
				
				
				
				writer.write(n);
				
			

				
			}

				writer.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
