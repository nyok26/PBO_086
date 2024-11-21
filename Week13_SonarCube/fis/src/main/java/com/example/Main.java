package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        
        String filePath = System.getProperty("filePath", "resources/example.txt");
        
        
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            
            LOGGER.log(Level.SEVERE, "Failed to read file at: {0}", filePath);
            LOGGER.log(Level.SEVERE, "Error details: {0}", e.getMessage());
        }
    }
}
