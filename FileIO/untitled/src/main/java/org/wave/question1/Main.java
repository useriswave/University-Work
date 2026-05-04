package org.wave.question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lineNumbers = 0;
        var sumNumbers = new ArrayList<Double>();
        var helloCount = new ArrayList<Integer>();
        var encodedWords = new ArrayList<String>();
        var nonNumericWords = new ArrayList<Integer>();

        File f = new File("src/main/resources/text-files/students.txt");
        try{
            Scanner lineReader = new Scanner(f);
            Scanner sc = null;
            while(lineReader.hasNextLine()) {
                String line = lineReader.nextLine();
                lineNumbers++;

                sc = new Scanner(line);
                int nonNumericCount = 0;
                int hellos = 0;
                double sumNumbersLine = 0;
                String encodedToAdd = "";
                while(sc.hasNext()) {
                    String data = sc.next();
                    if(isNonNumericWord(data)) {
                        nonNumericCount++;
                        if(data.length() <= 4) {
                            String encoded = "";
                            for(int i = 0; i < data.length(); i++) {
                                encoded += (char) ((int) data.charAt(i) + 1);
                            }
                            encodedToAdd += encoded + ", ";
                        }
                    }
                    if(isNumber(data)) {
                        try {
                            sumNumbersLine+=Double.parseDouble(data);
                        }
                        catch(NumberFormatException e ) {
                            System.out.println("cannot parse number");
                        }
                    }
                    if(data.equalsIgnoreCase("hello")) {
                        hellos++;
                    }

                }

                nonNumericWords.add(nonNumericCount);
                encodedWords.add(encodedToAdd);
                sumNumbers.add(sumNumbersLine);
                helloCount.add(hellos);
            }
            if(sc != null)
                sc.close();
            lineReader.close();
        }
        catch(FileNotFoundException e) {
            System.out.printf("File '%s' does not exist.\n", f.getName());
        }

        File studentReport = new File("student_output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(studentReport);
            System.out.println(studentReport.getAbsolutePath());

            for(int i = 0; i < lineNumbers; i++) {
                printWriter.println("Line: " + (i+1));
                printWriter.println("Total of all numbers: " + sumNumbers.get(i));
                printWriter.println("Number of all non numeric words: " + nonNumericWords.get(i));
                printWriter.println("Number of times 'hello' appears: " + helloCount.get(i));
                String enc;
                if(encodedWords.get(i).length() >= 2) {
                    enc = encodedWords.get(i).substring(0, encodedWords.get(i).length() - 2);
                }
                else {
                    enc = encodedWords.get(i);
                }
                printWriter.println("Encoded words len <= 4" + enc);
                printWriter.println();
            }
            System.out.printf("File: %s has been created in: %s\n", studentReport.getName(), studentReport.getAbsolutePath());
            printWriter.flush();
        }
        catch(FileNotFoundException e) {
            System.out.printf("Directory '%s' does not exist.\n", studentReport.getAbsolutePath());
        }

    }

    public static boolean isNonNumericWord(String data) {
        for(int i = 0; i < data.length(); i++) {
            if(!Character.isLetter(data.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isNumber(String data) {
        try {
            Double.parseDouble(data);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}