package interfacebased;

import java.time.LocalDate;

public class Director {

     public void createBMWCar(Builder builder){
         builder.reset();
         builder.setModel("BMW");
         builder.setYearOfManufactoring(LocalDate.now());
     }


    public void createBMWCarManual(Builder builder){
        builder.reset();
        builder.setModel("BMW");
        builder.setYearOfManufactoring(LocalDate.now());
    }

}
