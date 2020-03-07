package interfacebased;

import java.time.LocalDate;

public class CarManualBuilder implements Builder {

    private CarManual carManual;

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setModel(String model) {
        carManual.setModel(model);
    }

    @Override
    public void setYearOfManufactoring(LocalDate yearOfManufactoring) {
        carManual.setYearOfManufacture(yearOfManufactoring);
    }

    public CarManual getProduct(){
        return carManual;
    }
}
