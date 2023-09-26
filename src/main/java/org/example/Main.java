package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.givenAFileShowStringAlongWithTheLineNumber("no quiero", new File("./quijote.txt"));
    }

    public static void givenAFileShowStringAlongWithTheLineNumber(String givenLine, File givenFile) {
        StringBuilder textFileBuilder = new StringBuilder();
        Scanner textReader;

        ArrayList<String> textStore = new ArrayList<>();

        try {
            textReader = new Scanner(givenFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int i = 0;
        // So the idea is to make a string array, with each entry being a different line
        while (textReader.hasNextLine()){
            textStore.add(textReader.nextLine());
        }
        for (int j = 0; j < textStore.size(); j++) {
            if (textStore.get(j).contains(givenLine)){
                System.out.println(givenLine + "<- was found in line: " + (j+1));
            }
        }

    }
}