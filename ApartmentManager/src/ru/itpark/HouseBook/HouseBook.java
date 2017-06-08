package ru.itpark.HouseBook;


import ru.itpark.DAO.FlatDao;
import ru.itpark.DAO.OwnerDao;
import ru.itpark.Flat.Flat;

public class HouseBook {
    private FlatDao flatDao;
    private OwnerDao ownerDao;

    public HouseBook(FlatDao flatDao, OwnerDao ownerDao) {
        this.flatDao = flatDao;
        this.ownerDao = ownerDao;
    }

    public void addFlatToOwner(Flat flat) {
        int userId = flat.getOwnerId();
        if (ownerDao.isExistById(userId)) {
            flatDao.save(flat);
        } else {
            System.err.println("Пользователь не найден");
        }
    }
}
