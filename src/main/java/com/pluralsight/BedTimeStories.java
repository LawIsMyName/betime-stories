package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the story file name: ");
        String fileName = scanner.nextLine();

        int lineNumber = 1;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileName);

            String line = bufferedReader.readLine();

            while (line != null) {

                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (Exception e) {
            //throw new RuntimeException(e);

            e.printStackTrace();

        }

    }
}
