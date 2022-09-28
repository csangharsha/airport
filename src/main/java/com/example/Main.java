package com.example;

import com.opencsv.CSVReader;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CSVRecord record = new CSVRecord();
    }

    public static void readDataLineByLine(String file)
    {

        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);

            List<String[]> allData = csvReader.readAll();
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
