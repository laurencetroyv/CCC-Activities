package exam;

import java.io.*;

public class caat {
	public static void cat(File named) {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(named, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } catch(FileNotFoundException fnf) {
	    	System.out.println("File: " + named + " not found.");
	    } catch(Exception e) {
	    	System.out.println(e.toString());
	    } finally {
	        if (input != null) {
	            try {
	                input.close();
	            } catch(IOException io) {
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		cat(new File("cat.txt"));
	}
}