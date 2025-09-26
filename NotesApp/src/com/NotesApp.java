package com;


import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NoteManager manager = new NoteManager();
        boolean running = true;

        System.out.println("=== Notes App ===");

        while (running) {
            System.out.println("\n1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Delete All Notes");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String content = sc.nextLine();
                    manager.addNote(new Note(content));
                    break;

                case 2:
                    System.out.println("\n--- Your Notes ---");
                    for (Note note : manager.getAllNotes()) {
                        System.out.println("- " + note);
                    }
                    break;

                case 3:
                    System.out.print("Are you sure? This will delete all notes (y/n): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        manager.deleteAllNotes();
                    } else {
                        System.out.println("Deletion cancelled.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice, try again!");
            }
        }
        sc.close();
    }
}
