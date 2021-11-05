package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Passenger> passengerList = new ArrayList<>();
    private int maxCapacity;

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if ( passengerList.size() < maxCapacity) {
            passengerList.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int numberOfPackages = 0;
        for (Passenger passenger: passengerList
             ) {
            numberOfPackages += passenger.getNumberOfBags();
        }
        return numberOfPackages;
    }
}
