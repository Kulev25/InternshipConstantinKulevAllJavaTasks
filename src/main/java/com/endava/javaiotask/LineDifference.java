package com.endava.javaiotask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LineDifference {
//    private static List<String> commonContent;

    public static void main(String[] args) throws IOException {

        Path initialFilePath = Paths.get("src/main/java/com/endava/javaiotask/resource/file1.txt");
        Path comparisonFilePath = Paths.get("src/main/java/com/endava/javaiotask/resource/file2.txt");
        Path commonContentPath = Paths.get("src/main/java/com/endava/javaiotask/resource/commonContent.txt");
        Path initialFileUniqueContentPath = Paths.get("src/main/java/com/endava/javaiotask/resource/DifferentContent1.txt");
        Path comparisonFileUniqueContentPath = Paths.get("src/main/java/com/endava/javaiotask/resource/DifferentContent2.txt");

        List<String> content = new ArrayList<>();
        List<String> commonContent = new ArrayList<>();
        List<String> initialFileContent = Files.readAllLines(initialFilePath);
        List<String> comparisonFileContent = Files.readAllLines(comparisonFilePath);

        System.out.println("Original file1: " + initialFileContent.toString());
        System.out.println("Original file2: " + comparisonFileContent.toString());

        commonContent = getCommonContent(initialFileContent,comparisonFileContent);
        System.out.println("Common words: " + commonContent.toString());
        writeInFile(commonContentPath, commonContent);

        content = getDifferentContent(initialFileContent,comparisonFileContent);
        System.out.println("Unique words for file1: " + content.toString());
        writeInFile(initialFileUniqueContentPath, content);

        content.clear();
        content = getDifferentContent(comparisonFileContent,initialFileContent);
        System.out.println("Unique words for file2: " + content.toString());
        writeInFile(comparisonFileUniqueContentPath, content);

    }

    public static List<String> getCommonContent(List <String> initialFileContent, List<String> comparisonFileContent) {
        List<String> commonContent = new ArrayList<>();
        for (String s : initialFileContent) {
            for (String value : comparisonFileContent) {
                if (s.equals(value)) {
                    commonContent.add(s);
                }
            }
        }
            return commonContent;
    }
    

    public static void writeInFile (Path path, List content){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(path)));
            bw.write(String.valueOf(content.toString()));
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static List<String> getDifferentContent(List <String> initialFileContent, List<String> comparisonFileContent) {
        List<String> differentContent = new ArrayList<>();
        for (String value : initialFileContent) {
            boolean isFile1Uninique = true;
            for (String s : comparisonFileContent) {
                if (value.equals(s)) {
                    isFile1Uninique = false;
                    break;
                }
            }
            if (isFile1Uninique) {
                differentContent.add(value);
            }
        }
        return differentContent;
    }

}