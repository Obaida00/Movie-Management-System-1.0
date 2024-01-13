package Models;

import Helpers.*;
import java.util.ArrayList;

public class Booking{
  private User user;
  private ArrayList<Ticket> bookedTickets;

  public Booking(User user) {
    this.user = user;
    this.init();
  }
  
  public void bookTicket(Ticket t){
    this.bookedTickets.add(t);
  }
  
  public void bookTicket(String id){
    Ticket ticket = new Ticket(id);
    this.bookTicket(ticket);
  }

  private void init(){
    bookedTickets = new ArrayList<>();
  }
  
  public User getUser() {
    return user;
  }
  public ArrayList<Ticket> getBookedTickets() {
    return bookedTickets;
  }
}