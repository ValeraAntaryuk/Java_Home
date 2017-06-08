package ru.itpark;

import ru.itpark.DAO.FlatDao;
import ru.itpark.DAO.FlatDaoFileBase;
import ru.itpark.DAO.OwnerDao;
import ru.itpark.DAO.OwnerDaoFileBase;
import ru.itpark.Flat.Flat;
import ru.itpark.Generators.IdGenerator;
import ru.itpark.Generators.IdGeneratorImp;
import ru.itpark.HouseBook.HouseBook;

public class Main {

    public static void main(String[] args) {

        IdGenerator idGenerator = new IdGeneratorImp("flats_id.txt");
        OwnerDao ownerDao = new OwnerDaoFileBase("owners.txt");
        FlatDao flatDao = new FlatDaoFileBase("flats.txt",idGenerator);
        HouseBook houseBook = new HouseBook(flatDao,ownerDao);
        Flat flat = new Flat(1,35,1);
        houseBook.addFlatToOwner(flat);

    }
}
