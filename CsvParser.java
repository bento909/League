package com.ben.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvParser {

    private String filePath;
    private File file;
    private Scanner scanner;

    public CsvParser(String filePath) {
        this.filePath = filePath;
        this.file = new File(filePath);
    }

    private List<String> parseNextLine() throws IOException {
        if(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            return Arrays.asList(tokens);
        }
        return null;
    }

    public List<List<String>> parseFile() throws IOException {
        this.scanner = new Scanner(file);
        List<List<String>> fileContents = new ArrayList<>();
        while(scanner.hasNextLine()) {
            fileContents.add(parseNextLine());
        }
        return fileContents;
    }

}
