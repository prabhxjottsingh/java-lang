package ticketBooking.main.entities;

import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private Integer trainNumber;
    private String trainName;
    private List<List<Boolean>> seats;
    private Map<String, String> stationArrivalTimes;
    private List<String> stations;

    public Train(){
        // default constructor
    }

    public Train(String trainId, Integer trainNumber, String trainName, List<List<Boolean>> seats, Map<String, String> stationArrivalTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.seats = seats;
        this.stationArrivalTimes = stationArrivalTimes;
        this.stations = stations;
    }

    public String getTrainId(){
        return trainId;
    }

    public Integer getTrainNumber(){
        return trainNumber;
    }

    public String getTrainName(){
        return trainName;
    }

    public List<List<Boolean>> getSeats(){
        return seats;
    }

    public Map<String, String> getStationArrivalTimes(){
        return stationArrivalTimes;
    }

    public List<String> getStations(){
        return stations;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setTrainNumber(Integer trainNumber){
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName){
        this.trainName = trainName;
    }

    public void setSeats(List<List<Boolean>> seats){
        this.seats = seats;
    }

    public void setStationArrivalTimes(Map<String, String> stationArrivalTimes){
        this.stationArrivalTimes = stationArrivalTimes;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getTrainInfo(){
        return "Train ID: " + trainId + "\nTrain Number: " + trainNumber + "\nTrain Name: " + trainName + "\nSeats: " + seats + "\nStation Arrival Times: " + stationArrivalTimes + "\nStations: " + stations;
    }

    public void printSeats(){
        for(List<Boolean> seatRow : seats){
            for(Boolean seat : seatRow){
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public void printStationArrivalTimes(){
        for(Map.Entry<String, String> stationArrivalTime : stationArrivalTimes.entrySet()){
            System.out.println(stationArrivalTime.getKey() + " : " + stationArrivalTime.getValue());
        }
    }

}
