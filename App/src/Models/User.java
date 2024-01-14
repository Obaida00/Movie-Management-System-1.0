package Models;

import java.util.*;

public class User{
  private static Map<String,User> userMap = new HashMap<>();
  private static ArrayList<User> userList = new ArrayList<>();//list or hashmap or hashset
  public static int userCount = 0;
  private String username;
  private String password;
  private String imgPath;
  private Booking booking;

  public User(String username, String password, String imgPath) {
    this.username = username;
    this.password = password;
    this.imgPath = imgPath;
    this.init();
    this.addUser();
    userCount++;
  }
  
  //to initialize
  private void init() {
    booking = new Booking(this);
  }

  //adding User to static sets and maps
  private void addUser(){
    userMap.put(this.username, this);
    userList.add(this);
  }
  
  //getters & setters
  public static Map<String, User> getUserMap() {
    return userMap;
  }
  public static ArrayList<User> getUserList() {
    return userList;
  }
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public String getImgPath() {
    return imgPath;
  }
  public Booking getBooking() {
    return booking;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }
}