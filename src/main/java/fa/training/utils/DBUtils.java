package fa.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    public DBUtils() {

    }
    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;encrypt=false;database=SMS;integratedSecurity=false;";
            String username = "sa";
            String password ="1234";
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("connect success");
            return conn;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
