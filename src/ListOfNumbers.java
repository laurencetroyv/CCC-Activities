//Submitted by: Laurence Troy Sambaan Valdez

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
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
		list.writeList();

		try {
			readList();
		} catch (ArithmeticException | IOException e) {
			System.out.println("Caught Error!: " + e.getMessage());
		}

		System.out.println("\nEnd of Program");
	}

	public static void readList() throws IOException, FileNotFoundException, ArithmeticException {
		ListOfNumbers list = new ListOfNumbers();

		System.out.println("Displaying Veector data \n" + list.victor);
		System.out.println("\nStarting fileread.");

		File file = new File("OutFile.txt");
		Scanner scan = new Scanner(file);

		System.out.println("Printing each value from a file.");
		while (scan.hasNextLine()) {
			String raw = scan.nextLine();
			String[] data = raw.split("\\=\\s");

			System.out.println(data[1]);

			list.victor.add(Integer.parseInt(data[1]));
		}
		System.out.println("\nAppending new data to the end of victor, \nPrinting new Vector\n" + list.victor + "\nClosing filescan");
		scan.close();
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