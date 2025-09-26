The objective of this project is to create a text-based notes management system using Java. The system demonstrates Object-Oriented Programming (OOP) concepts and file input/output operations to persist user data. Users can add, view, and delete notes using a simple menu-driven interface.
Project Description
The Notes App is a command-line application that allows users to manage notes efficiently. 
The project is built using OOP principles and consists of the following core classes:
Note → Represents an individual note with content.
NoteManager → Handles file operations such as adding notes, reading notes, and deleting all notes.
NotesApp → Contains the main method and provides a menu-driven interface for user interaction.

Functionalities:
Add Note → Allows users to write a note, which is appended to notes.txt.
View Notes → Displays all previously saved notes by reading the file.
Delete All Notes → Clears all notes from the file after confirmation.
Exit → Closes the application safely.

The system ensures data persistence, meaning all notes remain saved in the file even after the application is closed. 
The modular OOP design makes it easy to extend features like editing or searching notes.

OOP Concepts Used
Class & Object → Note, NoteManager, and NotesApp are separate classes; objects are created to represent notes and manage them.
Encapsulation → Note content is private and accessed through getter methods.
Abstraction → Users interact with high-level methods like addNote() and getAllNotes() without knowing file handling details.
Modularity & Reusability → File operations are encapsulated in NoteManager, making code clean and maintainable.
