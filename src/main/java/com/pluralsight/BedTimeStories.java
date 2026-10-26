package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // add prompt
        System.out.println("Enter the story file name: ");
        String fileName = scanner.nextLine();

        // initialize number start at 1
        int lineNumber = 1;

            // add file reader stuff with try and catch
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            // loop for reading the whole story line by line
            while (line != null) {

                System.out.println(lineNumber + ". " + line);

                lineNumber++;

                line = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (Exception e) {
            //throw new RuntimeException(e);

            // message for error
            System.out.println("file not found.");

            //e.printStackTrace();

        }

        scanner.close();

        // goodbye statement
        System.out.println("Kydon sends his regards :) ");

    }
}
