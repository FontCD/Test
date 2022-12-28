package com.example.calculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogCreator {
    public static String finalRecord = "----------EXECUTION LOG----------\n";

    public static File log = new File("C:/users/fonte/desktop/log.txt");

    public static void startLog() {
        if (log.exists()) {
            System.out.println("File " + log.getName() + " exists");
            System.out.println("His path is " + log.getPath());
        } else {
            System.out.println("File " + log.getName() + " not found. Log file for this execution will not be created");
        }
    }

    public static void updateLog(String newRecord) {
        finalRecord = finalRecord + "\n" + newRecord;
    }

    public static void closeLog(String finalRecord) {
        try {
            FileWriter writer = new FileWriter(log.getPath());
            writer.append(finalRecord);
            writer.append("\n\n").append(String.valueOf(java.time.LocalDateTime.now()));
            System.out.println("Log closed at time: " + (java.time.LocalDateTime.now()));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
