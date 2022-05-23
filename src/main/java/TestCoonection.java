import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestCoonection {

    public static void main(String[] args) {
        Connection connection;


        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);


            connection = DriverManager.getConnection(PrivateData.URL, PrivateData.USERNAME, PrivateData.PASSWORD);

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }

            connection.close();

            if(connection.isClosed()) {
                System.out.println("Соединение с БД закрыто");
            }



        } catch (SQLException sqle)  {
            System.err.println("Не удалось загрузить класс драйвера");
        }





    }
}
