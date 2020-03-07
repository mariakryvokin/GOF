package interfacebased;

import java.time.LocalDate;

public interface Builder {

    void reset();
    void setModel(String model);
    void setYearOfManufactoring(LocalDate yearOfManufactoring);
}
