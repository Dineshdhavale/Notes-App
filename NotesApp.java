package com.elevateLabs;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {
	
    private static final String FILE_NAME = "notes.txt";
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			displayMenu();
			System.out.print("Enter your choice: ");
			while(!sc.hasNextInt()) {
				System.out.println("Invalid Input.please enter a number");
				sc.next();
				System.out.print("Enter your choice: ");
			}
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:addNote(sc);
                   break;			
				
			case 2:viewNotes();
			       break;
				
			case 3:System.out.println("Exiting Note App. goodbye...!");
				   break;
			default:System.out.println("Invalid choice. please try again");	
			}
			System.out.println();
			
		}while(choice !=3);
		sc.close();
	}

	private static void displayMenu() {
		System.out.println("---Note App Menu---");
		System.out.println("1. Add a New Note");
		System.out.println("2.View Note ");
		System.out.println("3.Exit");
		System.out.println("------------------");
		
	}
	
	private static void addNote(Scanner scanner) {
		System.out.println("Enter your note:");
		String note = scanner.nextLine();
		
		try(FileWriter fileWriter = new FileWriter(FILE_NAME, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			bufferedWriter.write(note);
			bufferedWriter.newLine();
			System.out.println("Note Add Successfully");
		}
		catch (IOException e) {
			System.out.println("An error occured while writing the note: " + e.getMessage());
		}
		
	}
	
	private static void viewNotes() {
		System.out.println("--view note--");
		 try (FileReader fileReader = new FileReader(FILE_NAME);
	             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			 
			 String line;
			 boolean hasNote = false;
			 while((line = bufferedReader.readLine()) != null) {
				 System.out.println(line);
				 hasNote = true;
			 }
			 if(!hasNote) {
				 System.out.println("No Notes Found Yet. Add some notes ");
			 }
	
		
	}
		 catch(IOException e) {
			 System.err.println("An error occurred while reading notes: " + e.getMessage());
	            System.out.println("If this is the first run, the file 'notes.txt' might not exist yet. It will be created when you add a note.");
		 }
		 System.out.println("----------");
	}

}
