package lesson29_Encapsulation;

public class Car {

    private String brand;
    private String model;
    private String fuel;
    private int door;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        if ("electricity".equals(fuel) || "gasoline".equals(fuel) || "diesel".equals(fuel))
            this.fuel = fuel;
        else
            throw new IllegalArgumentException();
    }

    public int getDoor() {
        return door;
    }
    public void setDoor(int door) {
        if (door == 2 || door == 4)
            this.door = door;
        else
            System.out.println("Car doors must be 2 or 4");
    }

    public int getSpeed() {
        if (fuel.equals("electricity")) {
            System.out.println("250");
        }
        if (fuel.equals("gasoline")) {
            System.out.println("300");
        }
        if (fuel.equals("diesel")) {
            System.out.println("200");
        }
        return speed;
    }
}
