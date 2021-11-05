package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Joe","3333fff", 3);
        Passenger passenger2 = new Passenger("Joe","3333fff", 3);
        Passenger passenger3 = new Passenger("Joe","3333fff", 3);
        Passenger passenger4 = new Passenger("Joe","3333fff", 3);

        Plane plane = new Plane();
        plane.setMaxCapacity(2);
        plane.addPassenger(passenger);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        plane.addPassenger(passenger4);

        System.out.println(plane.numberOfPackages());
    }
}
