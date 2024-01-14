/*
 * Auther: Obaida Al_Melhem
 * almelhemo@gmail.com
 */

import Controllers.UserController;
import Models.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Obaida
 */
public class GlobalITest {

  public GlobalITest() {
  }
  
  static User obaida;
  static User Talal;
  static User obaida2;
  static UserController userController;
  
  @BeforeClass
  public static void setUpClass() {
    obaida = new User("Obaida", "Obaida2005", "path1");
    Talal = new User("Talal", "Talal2004", "path2");
    obaida2 = new User("Obaida2", "Obaida2005", "path3");
    
    userController = new UserController();
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  

  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  //testing user lists and maps in User Class
  @Test
  public void testingUserLists() {
   //testing if maps and sets contains all objects
   assertEquals("ArrayList count test", User.getUserList().size(), User.userCount);
   assertEquals("Map count test", User.getUserMap().size(), User.userCount);
  }   
   
   
  //testing login function in UserController Class
  @Test
  public void testingLogin() {
    //testing if i can't login with non existing account
    boolean nonValidLogin = userController.loginValidate("Obaida", "1234")
            || userController.loginValidate("Talal2", "Talal2004");
    assertEquals("non valid Login test", false, nonValidLogin);

    //testing if i can login with an existing account
    boolean validLogin = userController.loginValidate("Obaida", "Obaida2005");
    assertEquals("valid Login test", true, validLogin);

    //testing if currentUser has the logged in user
    User currentUser = userController.getCurrentUser();
    assertEquals("current user test", obaida, currentUser);
  }     
  
  //testing signup function in UserController Class
  @Test
  public void testingSignup(){
    //testing signup with existing username
    boolean nonValidSignup = userController.signup("Talal", "Talal2004", "path");
    assertEquals("non valid signup test", false, nonValidSignup);
    assertEquals("non valid signup usercount test", User.getUserMap().size(), User.userCount);
    
    //testing signup with new username
    boolean ValidSignup = userController.signup("Talal3", "Talal2004", "path");
    assertEquals("valid signup test", ValidSignup, true);
    assertEquals("valid signup usercount test", User.getUserMap().size(), User.userCount);
    
    //testing if i can login again with new user info
    boolean newUserLogin = userController.loginValidate("Talal3", "Talal2004");
    assertEquals("valid Login after signup test", true, newUserLogin);
  }


}
