Java Notes Application
This is a simple console-based Java application that allows users to manage plain text notes. It provides functionality to add new notes and view all existing notes, storing them in a local file.

Features
Add Notes: Write and save new notes to a text file.

View Notes: Display all previously saved notes from the file.

Persistent Storage: Notes are saved to notes.txt and persist between application runs.

User-Friendly Menu: Simple command-line interface for easy interaction.

Prerequisites
To run this application, you will need:

Java Development Kit (JDK): Version 8 or higher. You can download it from the Oracle website or through your preferred package manager.

Text Editor or IDE: Such as VS Code, IntelliJ IDEA, or Eclipse.

Getting Started
Follow these steps to set up and run the application on your local machine.

1. Save the Code
Copy the provided Java code into a file named NotesApp.java.

2. Open Terminal/Command Prompt
Navigate to the directory where you saved NotesApp.java using your terminal or command prompt.

cd path/to/your/notesapp/directory

3. Compile the Application
Compile the Java source file using the javac command:

javac NotesApp.java

If there are no compilation errors, this command will create a NotesApp.class file in the same directory.

4. Run the Application
Execute the compiled Java application using the java command:

java NotesApp

How to Use
Once the application is running, you will see a menu in your terminal:

---Note App Menu---
1. Add a New Note
2. View Note
3. Exit
------------------
Enter your choice:

Add a New Note (Option 1):

Enter 1 and press Enter.

You will be prompted to "Enter your note:". Type your note and press Enter.

The application will confirm "Note Add Successfully".

View Notes (Option 2):

Enter 2 and press Enter.

All your saved notes will be displayed in the terminal.

If no notes have been added yet, it will display "No Notes Found Yet. Add some notes".

Exit (Option 3):

Enter 3 and press Enter to exit the application.

You will see "Exiting Note App. goodbye...!".

File Storage
The application stores all notes in a plain text file named notes.txt. This file will be created automatically in the same directory from which you run the java NotesApp command, the first time you add a note.

Error Handling
Invalid Input: The application handles non-integer input gracefully when asking for menu choices, prompting the user to enter a valid number.

File I/O Errors: It includes basic try-catch blocks to handle IOException during file read/write operations, printing an error message to the console. It also informs the user if the notes.txt file doesn't exist yet during the first run.

Code Structure
NotesApp.java: The main Java source file containing the application logic.

FILE_NAME: A constant string defining the name of the file used for notes.

main(String[] args): The entry point of the application, managing the main menu loop.

displayMenu(): A private helper method to print the menu options to the console.

addNote(Scanner scanner): A private method to prompt for and write a new note to notes.txt in append mode. It uses FileWriter and BufferedWriter within a try-with-resources statement for efficient and safe file handling.

viewNotes(): A private method to read and display all notes from notes.txt. It uses FileReader and BufferedReader within a try-with-resources statement.
