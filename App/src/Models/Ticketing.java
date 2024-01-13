package Models;

import Helpers.*;
import java.util.*;

public class Ticketing{
  //init proprities
  private Movie movie;
  private ShowTime showTime;
  private int hall;
  private boolean[][] availableSeats;

  public Ticketing(Movie movie, ShowTime showTime, int hall) {
    this.movie = movie;
    this.showTime = showTime;
    this.hall = hall;
    availableSeatsInit();
  }

  //seat booking function, may need ferther editing
  public void bookSeat(int row, int num){
    availableSeats[row][num] = false;
  }
  
  //to initilize the availbale seats array
  private void availableSeatsInit() {
    int row = Statics.ROW_PER_THEATRE;
    int num = Statics.SEAT_PER_ROW;
    availableSeats = new boolean[row][num];
    for(int i=0; i<row; i++)
      for(int j=0; j<num; j++)
        availableSeats[i][j] = true;
  }
  
  //getters
  public ShowTime getShowTime() {
    return showTime;
  }
  public int getHall() {
    return hall;
  }
  public boolean[][] getavailableSeats() {
    return availableSeats;
  }
}