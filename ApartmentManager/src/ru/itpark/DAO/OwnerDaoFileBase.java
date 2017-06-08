package ru.itpark.DAO;

import ru.itpark.Owner.Owner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;


public class OwnerDaoFileBase implements OwnerDao{
     private String fileName;

     public OwnerDaoFileBase(String fileName) {
          this.fileName = fileName;
     }


     @Override
     public boolean isExistById(int idOwner) {
          try {
               BufferedReader reader = new BufferedReader(new FileReader(fileName));
               String currentLine = reader.readLine();
               while (currentLine != null) {
                    String lineAsArray[] = currentLine.split(" ");
                    String userIdFromFileAsString = lineAsArray[0];
                    int userIdFromFileAsInt = Integer.parseInt(userIdFromFileAsString);

                    if (idOwner == userIdFromFileAsInt) {
                         return true;
                    }
                    currentLine = reader.readLine();
               }
          return false;
          } catch (FileNotFoundException e) {
               System.err.println("Файл не найден");
          } catch (IOException e) {
               System.err.println("Ошбика ввода вывода");
          }
          return false;
     }


     @Override
     public ArrayList<Owner> findAll() {
          return null;
     }
}
