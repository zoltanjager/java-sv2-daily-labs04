package day04;

public class Passenger {
    private String name;
    private String ticket;
    private int numberOfBags;

    public Passenger(String name, String ticket, int numberOfBags) {
        this.name = name;
        this.ticket = ticket;
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
