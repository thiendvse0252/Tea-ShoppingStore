/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiendv.teastore.test;

import java.sql.SQLException;
import javax.naming.NamingException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sample.user.UserDTO;
import static sample.user.UserDAO.getUsername;

/**
 *
 * @author thien
 */
@RunWith(value = Parameterized.class)
public class DDTTest {

    public DDTTest() {
    }

    //bộ data , là mảng 2 chiều
    //ứng vs các test case
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][]{{"admin",new UserDTO("admin").getUserID()}, {"hoadnt",new UserDTO("hoadnt").getUserID()}
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public String expected;  //map vào cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public String actual;  //map vào cột 1 của mảng
    
    @Test
    public void testReturnsWell() throws SQLException, ClassNotFoundException, NamingException {
//        UserDAO dao = new UserDAO();
        actual = getUsername(new UserDTO("025024"));
        assertEquals(expected, actual);  

    }

}
