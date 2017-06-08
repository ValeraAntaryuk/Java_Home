package ru.itpark.Generators;

import java.io.*;

public class IdGeneratorImp implements IdGenerator {
    private int lastFlatId;
    private String flatIdFileName;

    public IdGeneratorImp (String flatIdFileName) {
        this.flatIdFileName = flatIdFileName;
        try {
            BufferedReader flatReader = new BufferedReader(new FileReader(flatIdFileName));
            lastFlatId = Integer.parseInt(flatReader.readLine());
        } catch (IOException e) {
            System.err.println("Проблемы с вводом выводом");
        }
    }

    @Override
    public int generateForOwner() {
        return 0;
    }

    @Override
    public int generateForFlat() {
        int newId = lastFlatId + 1;
        try {
            BufferedWriter flatWriter = new BufferedWriter(new FileWriter(flatIdFileName));
            flatWriter.write(newId + "");
            flatWriter.close();
        } catch (IOException e) {
            System.err.println("Проблемы с вводом выводом");
        }
        return newId;
    }
}
