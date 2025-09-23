package Generics;

import java.util.List;

public class Wildcard {

    public void setPrintValues(List<Vehicle> vehicleList){
    }

    public void upperbound(List<? extends Vehicle> vehicleList){

    }

    public void lowerbound(List<? super Vehicle> vehicleList){}

    public void unbounded(List<?> vehicleList){}  // ? -> Object

    // wildcard method
    public void computeList(List<? extends Number> source, List<? extends Number> destination){}

    // generic type method
    public <T extends Number> void computeList1(List<T> source, List<T> destination){}

    // Difference
    // 1. Generic type methods all params should have restricted 1 type
    // 2. In wildcard lowerbound is possible
    // 3. In generic we can have multiple <K,V> but wildcard doesn't allow <?????>

    // Type erasure
    // When bytecode is generated, WIld card n generic type are replaced with actual values
}
