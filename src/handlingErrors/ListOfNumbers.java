package handlingErrors;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

public class ListOfNumbers {

	private Vector<Integer> victor;
	private static final int size = 10;

	public ListOfNumbers() {
		victor = new Vector<>(size);
		for (int i = 0; i < size; i++)
			victor.addElement(i);
	}

	public static void main(String[] args) {
		ListOfNumbers list = new ListOfNumbers();

		readList();

		System.out.println(list.victor);
	}

	private static void readList() {
		try {
			System.out.println("reading file");
			File file = new File("OutFile.txt");
			FileInputStream reader = new FileInputStream(file);
			DataInputStream data = new DataInputStream(reader);

			try {
				int i = data.readInt();
				System.out.println(i);
				data.close();
			} catch (IOException e) {
				System.err.println("Caught IOException: " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Caught FileNotFoundException: " + e.getMessage());
		}
	}

	public void writeList() {
		PrintStream out = null;

		try {
			System.out.println("Entering try statement");
			out = new PrintStream(new FileOutputStream("OutFile.txt"));

			for (int i = 0; i < size; i++)
				out.println("Value at: " + i + " = " + victor.elementAt(i));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing PrintStream");
				out.close();
			} else {
				System.out.println("PrintStream not open");
			}
		}
	}
}