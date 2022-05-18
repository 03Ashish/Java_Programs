/*Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a 
flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat 
within the row (such as 12F). Make two examples of tickets.*/

import java.util.*;

class Ticket {
    private String departure_city;
    private String arrival_city;
    private int flight_num;
    private String seat_num;
 
    // Ticket(String departure_city, string arrival_city, int flight_num, String seatnum) {
    //     this.departure_city = departure_city;
    //     this.flight_num = flight_num;
    //     this.arrival_city = arrival_city;
    //     this.seat_num = seatnum;
    // }

    public String getArrival_city() {
        return arrival_city;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public int getFlight_num() {
        return flight_num;
    }

    public String getSeat_num() {
        return seat_num;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public void setFlight_num(int flight_num) {
        this.flight_num = flight_num;
    }

    public void setSeat_num(String seat_num) {
        this.seat_num = seat_num;
    }

    void showData() {

    }
}

public class Ticket1 {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        t1.setDeparture_city("Arungabad");
        t1.setArrival_city("mumbai");
        t1.setFlight_num(4);
        t1.setSeat_num("abc");

        String departure_city=t1.getDeparture_city();
        String arrival_city=t1.getArrival_city();
        String seat_num=t1.getSeat_num();
        int flight_num=t1.getFlight_num();
        System.out.println("departure_city "+departure_city);
        System.out.println("arrival_city "+arrival_city);
        System.out.println("seat_num "+seat_num);
        System.out.println("flight_num "+flight_num);
    }
}
