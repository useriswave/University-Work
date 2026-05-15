package one;

import java.io.File;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CsvParser csvParser = new CsvParser();
        Random r = new Random();

        int size = r.nextInt(5, 11);
        String[][] arr = new String[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                arr[i][j] = Integer.toString( i);
            }
        }

        File f = new File("test.csv");
        if(csvParser.createCSV(f, arr)) {
            System.out.println("File \"" + f.getAbsolutePath() + "\" has been successfully created!");
        }
        else {
            System.out.println("File creation failed!");
        }

        String[][] content = csvParser.fillArrayWithCsvContent(f);

        System.out.println("CSV content printed in the console:");
        for(int i = 0; i < content.length; i++) {
            for(int j = 0; j < content[i].length; j++) {
                System.out.print(content[i][j]);
                if(j != content.length-1)
                    System.out.print(",");
            }
            System.out.println();
        }

    }

}