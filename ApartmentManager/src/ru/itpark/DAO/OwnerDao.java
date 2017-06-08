package ru.itpark.DAO;

import ru.itpark.Owner.Owner;

import java.util.ArrayList;

public interface OwnerDao {
        // возвращает true, если
        // пользователь с указанным id существует
        boolean isExistById(int idOwner);

        ArrayList<Owner> findAll();
    }
