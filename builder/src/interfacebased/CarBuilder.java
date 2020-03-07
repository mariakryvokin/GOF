package interfacebased;

import java.time.LocalDate;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setModel(String model) {
       car.setModel(model);
    }

    @Override
    public void setYearOfManufactoring(LocalDate yearOfManufacturing) {
        car.setYearOfManufacture(yearOfManufacturing);
    }

    public Car getProduct(){
        return car;
    }
}
