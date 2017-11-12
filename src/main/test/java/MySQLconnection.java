import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLconnection {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PWD = "tnwk09";

    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        try(Connection con = DriverManager.getConnection(URL, USER, PWD)){
            System.out.println(con);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
