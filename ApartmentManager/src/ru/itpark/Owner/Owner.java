package ru.itpark.Owner;

public class Owner {
    private String Name;
    private String firstName;
    private int idOwner;

    public Owner(String name, String firstName, int idOwner) {
        Name = name;
        this.firstName = firstName;
        this.idOwner = idOwner;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }
}
