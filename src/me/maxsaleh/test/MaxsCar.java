package me.maxsaleh.test;

public class MaxsCar extends Car
{
    @Override
    public int getCars() {
        return super.getCars();
    }

    @Override
    public boolean isHasDiesel() {
        return false;
    }

    @Override
    public int getCartype() {
        return super.getCartype();
    }

    @Override
    public void setHasDiesel(boolean hasDiesel) {
        super.setHasDiesel(hasDiesel);
    }

    @Override
    public void setCars(int cars) {
        super.setCars(cars);
    }

    @Override
    public void setCartype(int cartype) {
        super.setCartype(cartype);
    }

    @Override
    public void setCarname(String carname) {
        super.setCarname(carname);
    }
}
