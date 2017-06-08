package ru.itpark.DAO;

import ru.itpark.Flat.Flat;

import java.util.ArrayList;

public interface FlatDao {
    int save(Flat flat);
    ArrayList<Flat> findAll();

}
