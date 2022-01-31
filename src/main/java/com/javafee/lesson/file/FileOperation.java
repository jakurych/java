package com.javafee.lesson.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileOperation {
    public static void main(String[] args) {
        String fileName = "/home/kuba/git/java/src/main/java/com/javafee/lesson/file/data.txt";
        File file = new File("/home/kuba/git/java/src/main/java/com/javafee/lesson/file/data.txt");
        System.out.println(file.getName());

        // READ
        List<String> content;
        try {
            content = Files.readAllLines(Paths.get(fileName));

            for(String line : content)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println(e.getMessage() );
        }

        // WRITE
        try {
            Files.writeString(Paths.get(fileName), "\nNowy content", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e.getMessage() );
        }


        // READ
        try {
            content = Files.readAllLines(Paths.get(fileName));

            for(String line : content)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println(e.getMessage() );
        }

        if(Files.exists(Paths.get(fileName)))
            System.out.println("Plik istnieje!");
    }

    //pd
    // 
}
