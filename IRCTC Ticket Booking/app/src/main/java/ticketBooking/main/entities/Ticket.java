package ticketBooking.main.entities;

import java.sql.Date;

public class Ticket {
    private String ticketId;
    private String userId;
    private String sourceStation;
    private String destinationStation;
    private Date dateOfTravel;
    private Date bookingDate;
    private Train trainInfo;

    public String getTicketId(){
        return ticketId;
    }

    public String getUserId(){
        return userId;
    }

    public String printTicketInfo(){
        return "Ticket ID: " + ticketId + "\nUser ID: " + userId + "\nSource: " + sourceStation + "\nDestination: " + destinationStation + "\nDate of Travel: " + dateOfTravel + "\nBooking Date: " + bookingDate + "\nTrain Info: " + trainInfo.getTrainInfo();
    }

}
