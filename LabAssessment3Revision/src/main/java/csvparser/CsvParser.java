package csvparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CsvParser {

    private CsvParser() {}

    public static boolean createCSV(File f, String[][] content) {

        if(!f.getName().substring(f.getName().lastIndexOf('.')).equalsIgnoreCase(".csv")) {
            return false;
        }

        try {
            PrintWriter pw = new PrintWriter(f);

            for(String[] individualArray : content) {
                for(String c : individualArray) {
                    pw.print(c + ",");
                }
                pw.println();
            }

            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    /**
     * Creates an empty 2D String array based off the amount of rows and columns in a given CSV file
     * @param f file object
     * @return 2D String Array
     */
    private static String[][] int2dArrayRows(File f) {

        if(!f.getName().substring(f.getName().lastIndexOf('.')).equalsIgnoreCase(".csv")) {
            return null;
        }

        try {
            Scanner lineReader = new Scanner(f);

            int rows = 0;
            for(; lineReader.hasNextLine(); rows++) {
                lineReader.nextLine();
            }

            lineReader.close();
            return new String[rows][];

        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    private static String[][] initEmpty2dArrayCsv(File f) {
        String[][] arr = int2dArrayRows(f);
        if(arr == null)
            return null;

        try {
            Scanner lineReader = new Scanner(f);
            Scanner cellReader = null;

            for(int i = 0; lineReader.hasNextLine(); i++) {
                String line = lineReader.nextLine();
                cellReader = new Scanner(line);
                cellReader.useDelimiter(",|\\n");

                int j = 0;
                for(; cellReader.hasNext(); j++) {
                    cellReader.next();
                }

                arr[i] = new String[j];
            }

            lineReader.close();
            if(cellReader != null)
                cellReader.close();

        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    public static String[][] fillArrayWithCsvContent(File f) {
        String[][] arr = initEmpty2dArrayCsv(f);

        if(arr != null) {
            try {
                Scanner lineReader = new Scanner(f);
                Scanner cellReader = null;

                for(int i = 0; lineReader.hasNextLine(); i++) {
                    String line = lineReader.nextLine();
                    cellReader = new Scanner(line);
                    cellReader.useDelimiter(",|\\n");

                    for(int j = 0; cellReader.hasNext(); j++) {
                        arr[i][j] = cellReader.next();
                    }
                }

                lineReader.close();
                if(cellReader != null)
                    cellReader.close();

                return arr;

            } catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        return null;
    }
}
