package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class BedTimeStories {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader("goldilocks.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println("line");
            line = bufferedReader.readLine();
        }








    }
}
