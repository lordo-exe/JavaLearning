package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {

//    try {
//        fileDeleted = Files.deleteIfExists(studentFile.toPath());
//    }
//    catch(
//    IOException ex) {
//        System.out.println("Error deleting file: " + studentFile.getName());
//    }
//    if(fileDeleted) {
//        System.out.println(studentFile.getName() + " deleted.");
//    }
//    else {
//        System.out.println(studentFile.getName() + " not deleted.");
//    }
//
//
//    public Movie(String title, String description) {
//        this.dateCreated= LocalDate.now();
//        this.title = title;
//        this.description = description;
//    }
//
//    public LocalDate getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String toString() {
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/YYYY");
//        String state = "Title: " + title + "\n";
//        state = "Description: " + description + "\n";
//        state = "Date Created: " + dateFormat.format(dateCreated) + "\n";
//        return state;
//    }
}

class MovieTest {

    public static void main(String[] args) {
        File studentFile = new File("student.txt");
        boolean fileDeleted = false;
        try {
            fileDeleted = Files.deleteIfExists(studentFile.toPath());
        }
        catch(IOException ex) {
            System.out.println("Error deleting file: " + studentFile.getName());
        }
        if(fileDeleted) {
            System.out.println(studentFile.getName() + " deleted.");
        }
        else {
            System.out.println(studentFile.getName() + " not deleted.");
        }
    }


}