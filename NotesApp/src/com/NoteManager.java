package com;

import java.io.*;
import java.util.ArrayList;

public class NoteManager {
    private static final String FILE_NAME = "notes.txt";

    // Add a note to file
    public void addNote(Note note) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) { // append mode
            fw.write(note.getContent() + "\n");
            System.out.println(" Note saved successfully!");
        } catch (IOException e) {
            System.out.println(" Error writing to file: " + e.getMessage());
        }
    }

    // Read all notes from file
    public ArrayList<Note> getAllNotes() {
        ArrayList<Note> notesList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                notesList.add(new Note(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println(" No notes found. Please add notes first.");
        } catch (IOException e) {
            System.out.println(" Error reading file: " + e.getMessage());
        }
        return notesList;
    }

    // Delete all notes
    public void deleteAllNotes() {
        try (FileWriter fw = new FileWriter(FILE_NAME)) { // overwrite file
            // write nothing → clears file
            System.out.println(" All notes deleted successfully!");
        } catch (IOException e) {
            System.out.println(" Error clearing file: " + e.getMessage());
        }
    }
}

