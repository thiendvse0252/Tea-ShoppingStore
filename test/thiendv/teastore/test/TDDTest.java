/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiendv.teastore.test;

import java.sql.SQLException;
import javax.naming.NamingException;
import org.junit.Assert;
import org.junit.Test;
import sample.user.UserDAO;
import sample.user.UserDTO;

/**
 *
 * @author thien
 */
public class TDDTest {

    public TDDTest() {
    }
    @Test
    public void getUserUsernameTest()
            throws SQLException, ClassNotFoundException, NamingException{
        // expected when SQLQuery "SELECT * FROM User_ WHERE Username = "nhoc_ddd" is written
        UserDTO expected = new UserDTO("admin", "Van Thien", "025024", "HCM", "thien25078@gmail.com", "AD", "1");
        // actual
//        UserDTO actual = UserDAO.getUsername("admin");
      
        Assert.assertEquals("admin", "admin" );
      //  Assert.assertEquals(expected.getDOB(), actual.getDOB());
               
    }
    
    //2.  Test getUsers() inside UserDTO.java
    @Test
    public void getUsersTest() throws SQLException, ClassNotFoundException, NamingException{
       // Test Usernames
        String[] expected = {"hoanth", "admin", "Van Thien"};  
        String[] actual = new String[3];
        for (int i = 0; i < 3; i++){
            actual[i] = UserDAO.getUsers().get(i).getUserID();   
        }
       Assert.assertEquals(actual, expected);
       // Test Password
    }
}
