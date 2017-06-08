package ru.itpark.DAO;

import ru.itpark.Flat.Flat;
import ru.itpark.Generators.IdGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FlatDaoFileBase implements FlatDao {
    private String fileName;
    private IdGenerator idGenerator;

    public FlatDaoFileBase(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }


    @Override
    public int save(Flat flat) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            int newId = idGenerator.generateForFlat();
            flat.setFlatNumber(newId);
            String flatAsString = flat.getFlatNumber()
                    + " " + flat.getSquareFlat()
                    + " " + flat.getOwnerId();
            writer.write(flatAsString + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибки с вводом-выводом");
        }
        return 0;
    }

    @Override
    public ArrayList<Flat> findAll() {
        ArrayList<Flat> result = new ArrayList<>();
        // считываете построчно данные об автомобиле из файла
        // конвертируете в объект типа Auto
        // кладете данный объект в список
        // возвращаете список как результат
        return result;
    }
}
