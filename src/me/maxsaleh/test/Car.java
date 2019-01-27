package me.maxsaleh.test;

public class Car
{
    int cars;
    boolean hasDiesel = false;
    int cartype;
    String carname;

    public int getCars() {
        return cars;
    }

    public boolean isHasDiesel() {
        return hasDiesel;
    }

    public int getCartype() {
        return cartype;
    }

    public void setHasDiesel(boolean hasDiesel) {
        this.hasDiesel = hasDiesel;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public void setCartype(int cartype) {
        this.cartype = cartype;
    }

    public void setCarname(String carname)
    {
        this.carname = carname;
    }
}
