/*
 * This source file was generated by the Gradle 'init' task
 */
package ticketBooking.main;

import java.util.*;

import ticketBooking.Utils.UserServiceUtil;
import ticketBooking.main.entities.Ticket;
import ticketBooking.main.entities.User;
import ticketBooking.main.services.UserBookingService;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Running train ticket booking application");
        Scanner sc = new Scanner(System.in);

        int opt = 0;
        UserBookingService userBookingService;

        try{
            userBookingService = new UserBookingService();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            sc.close();
            return;
        }

        while( opt != 7 ){
            
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. View Bookings");
            System.out.println("4. Book Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Search Train");
            System.out.println("7. Exit the application");

            System.out.println("Enter your choice: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter username: ");
                    String username = sc.next();
                    System.out.println("Enter password: ");
                    String password = sc.next();
                    User userToSignUp = new User(username, password, UserServiceUtil.hashPassword(password), 
                                                new ArrayList<>(), UUID.randomUUID().toString());
                    userBookingService.signupUser(userToSignUp);
                    break;
                
                case 2:
                    System.out.println("Enter username: ");
                    String loginUsername = sc.next();
                    System.out.println("Enter password: ");
                    String loginPassword = sc.next();
                    User userToLogin = new User(loginUsername, loginPassword, UserServiceUtil.hashPassword(loginPassword), 
                                new ArrayList<>(), UUID.randomUUID().toString());
                    try{
                        userBookingService = new UserBookingService(userToLogin);
                    }catch(Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    List<Ticket> bookedTickets = userBookingService.fetchBooking();
                    for(Ticket ticket : bookedTickets){
                        System.out.println(ticket.printTicketInfo());
                    }
                    break;

                case 4:
                    // System.out.println("Enter source station: ");
                    // String sourceStation = sc.next();
                    // System.out.println("Enter destination station: ");
                    // String destinationStation = sc.next();
                    
            
                default:
                    break;
            }

        }

        sc.close();

    }
}
