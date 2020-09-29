package com.epam.data;

import java.io.FileWriter;
import java.io.IOException;

public class FileDataAcquirer   {
    private final static String FILE_NAME = "src/main/resources/input.txt";


    public void inputIn(float message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(String.valueOf((float)message));
            writer.append('\n');

            writer.flush();
        } catch (IOException ioException) {
            System.out.print(ioException.getMessage());
        }
    }
}
