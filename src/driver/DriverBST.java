package driver;

import java.io.*;
import java.util.*;

import exceptions.TreeException;
import utilities.BSTree;

public class DriverBST {
	public final static String PATH = "res/textfile.txt";
	public static void main(String[] args) throws TreeException, FileNotFoundException {
		
		readFile();

	}
	private static void readFile() throws FileNotFoundException{
		
		Scanner input = new Scanner(new File(PATH));
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}

}
