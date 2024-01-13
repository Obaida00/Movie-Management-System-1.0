package Controllers;

import Models.*;

public class UserController{
  private User currentUser;

  public boolean validateLogin(String username, String password){
    User user = this.searchUser(username);
    if(user.getPassword().equals(password)){
      this.setCurrentUser(user);
      return true;
    }
    return false;
  }
  
  public boolean signup(String username, String password, String imgPath){
    if(searchUser(username) != null)
      return false;
    new User(username, password, imgPath);
    return true;
  }
  
  private User searchUser(String username) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //if not existed return null
  }
  public void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }
  public User getCurrentUser(){
    return currentUser;
  }
}