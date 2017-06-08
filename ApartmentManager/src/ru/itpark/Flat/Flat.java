package ru.itpark.Flat;

public class Flat {
    private int flatNumber;
    private int squareFlat;
    private int ownerId;

    public Flat(int flatNumber, int squareFlat, int ownerId) {
        this.flatNumber = flatNumber;
        this.squareFlat = squareFlat;
        this.ownerId = ownerId;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getSquareFlat() {
        return squareFlat;
    }

    public void setSquareFlat(int squareFlat) {
        this.squareFlat = squareFlat;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}
