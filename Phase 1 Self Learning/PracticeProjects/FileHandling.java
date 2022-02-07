package PracticeProjects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		System.out.println("Adding to file");
		fileAdd();
		System.out.println("\nDisplaying contents of the file after adding");
		fileDisplay();
		System.out.println("\n\nAppending the file");
		appendFile();
		System.out.println("\nFile content after appending");
		fileDisplay();
		}
		private static void appendFile() {
		try {
		FileWriter myFile=new FileWriter("testing.txt",true);
		String str= "Weicome to Java";
		System.out.println("The next line to be added is " + str);
		myFile.write(str);
		System.out.println("The file appended successfully");
		myFile.close();
		}catch(IOException io) {
		io.printStackTrace();
		}
		}
		private static void fileDisplay() {
		try {
		File myFile=new File("testing.txt");
		Scanner sc= new Scanner(myFile);
		System.out.println("The contents of the file is");
		while(sc.hasNext()) {
		String data= sc.nextLine();
		System.out.print(data);
		}
		}catch(IOException io) {
		System.out.println("An exceeption was occured");
		io.printStackTrace();
		}
		}
		private static void fileAdd() {
		try {FileWriter myFile=new FileWriter("testing.txt");
		String str ="Hi Hello ";
		System.out.println("The string to be added is "+ str);
		myFile.write(str);
		System.out.println("The line was added successfully");
		myFile.close();
		}catch(IOException io)
		{ System.out.println("An exception was occured");
		io.printStackTrace();
		}
		
	}

}
