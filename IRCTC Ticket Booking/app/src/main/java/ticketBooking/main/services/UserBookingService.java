package ticketBooking.main.services;

import java.io.File;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticketBooking.Utils.UserServiceUtil;
import ticketBooking.main.entities.Ticket;
import ticketBooking.main.entities.Train;
import ticketBooking.main.entities.User;

public class UserBookingService {
    private User userInfo;
    private static final String USERS_PATH = "../localDB/users.json";
    private static final ObjectMapper objectMapper = new ObjectMapper(); // for serializing and de-serializing JSON
    private List<User> usersList;
    private static TrainService trainService;

    public UserBookingService(User userInfo) throws Exception {
        this.userInfo = userInfo;
        loadUsers();
    }

    public UserBookingService() throws Exception {
        loadUsers();
    }

    private void loadUsers() throws Exception{
        File usersDBdata = new File(USERS_PATH);
        this.usersList = objectMapper.readValue(usersDBdata, new TypeReference<List<User>>() {});
        trainService = new TrainService();
    }

    public boolean loginUser(){
        Optional<User> foundUser = usersList.stream().filter(currUser -> 
             currUser.getName().equalsIgnoreCase(userInfo.getName()) && 
                        UserServiceUtil.checkPassword(userInfo.getPassword(), currUser.getHashedPassword())
        ).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signupUser(User currUser){
        try{
            usersList.add(currUser);
            saveUsersListToFile();
            return Boolean.TRUE;
        }catch(Exception e){
            return Boolean.FALSE;
        }
    }


    public List<Ticket> fetchBooking(){
        return userInfo.getTicketsBooked();
    }

    public boolean cancelBooking(String ticketId){
        try{
            Ticket removedTicketInfo = userInfo.getTicketsBooked().stream().filter(ticket -> ticket.getTicketId().equals(ticketId)).findFirst().get();
            userInfo.getTicketsBooked().remove(removedTicketInfo);
            saveUsersListToFile();
            return Boolean.TRUE;
        }catch(Exception e){
            return Boolean.FALSE;
        } 
    }

    
    private void saveUsersListToFile() throws Exception {
        File usersDBdata = new File(USERS_PATH);
        objectMapper.writeValue(usersDBdata, usersList);
    }

    public List<Train> searchTrain(String source, String destination){
        return trainService.searchTrains(source, destination);
    }

}
