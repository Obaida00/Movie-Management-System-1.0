package ModelsControllers;

import Helpers.Ticket;
import java.util.ArrayList;

public class TicketingController{

  public Ticket generateTicket(){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  //gets the seat finds the ticket then books it returns if booked or not
  public boolean bookSeat(String seatId){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  //books the ticket; marks the object, adds it to user booking object returns if booked or not
  public boolean bookTicket(Ticket ticket){
    //here we call book ticket from booking controller
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  //retruns the currosponding Ticket 
  public Ticket searchTicket(String id){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  //returns the Ticket for a given seat
  public Ticket searchSeat(String seatId){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public ArrayList<String> getAvailableSeats(){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public ArrayList<Ticket> getAvailableTickets(){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}