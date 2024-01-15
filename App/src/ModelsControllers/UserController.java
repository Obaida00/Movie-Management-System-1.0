package ModelsControllers;

import Models.*;
import java.util.Map;

public class UserController{
  private User currentUser;

  public boolean loginValidate(String username, String password){
    User user = this.searchUser(username);
    if(user == null) 
      return false;
    if(!user.getPassword().equals(password))
      return false;
    this.setCurrentUser(user);
    return true;
    }
  
  public boolean signup(String username, String password, String imgPath){
    if(searchUser(username) != null)
      return false;
    new User(username, password, imgPath);
    return true;
  }
  
  private User searchUser(String username) {
    Map<String,User> userMap = User.getUserMap();
    if(userMap.containsKey(username))
      return userMap.get(username);
    return null;
  }
  
  public void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }
  public User getCurrentUser(){
    return currentUser;
  }
}