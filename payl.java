
import java.util.*;
import java.io.*;
public class payl {

	public static void readFile(String fileName) {
		File obj = new File(fileName);
		try {
			Scanner reader = new Scanner(obj);
			System.out.println("===== File Content =====");
			while(reader.hasNextLine()) {
				String data=reader.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found" );
		}
		
		
	}
	public static void createFile(String fileName) {
		
		try {
			File obj = new File(fileName);
			if(obj.createNewFile()) {
				System.out.println("File created: " + obj.getName());
			}
			else {
				System.out.println("File already exist");
			}
		}catch(IOException e) {
			System.out.println("Error occured! ");
		}
	}
	public static void writeFile(String fileName, String text) {
		try {
			FileWriter obj = new FileWriter(fileName);
			obj.write(text);
			obj.close();
			System.out.print("Succesfully Created");
		}catch(IOException e) {
			System.out.print("Error occured");
		}
	}
	public static void deleteFile(String delFile) {
		try {
			File obj = new File(delFile);
			if(obj.delete()) {
				System.out.println("File has been deleted");
			}
			else {
				System.out.println("File not found");
			}
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Read File
		/*System.out.print("What file do you want to open? ");
		String fileName = scan.next();
		readFile(fileName);*/
		
		//Create File
		/*System.out.print("What file do you want to Create? ");
		String fileName = scan.next();
		createFile(fileName);
		System.out.print("Write a text: ");
		scan.nextLine();
		String text = scan.nextLine();
		writeFile(fileName, text);*/
		
		System.out.print("What file do you want to Delete? ");
		String delFile = scan.next();
		deleteFile(delFile);
		
	}

}
