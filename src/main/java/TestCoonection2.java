import java.sql.*;


public class TestCoonection2 {

    public static void main(String[] args) {



        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException sqle)  {
            System.err.println("Не удалось загрузить класс драйвера");
        }

        try (Connection connection1 = DriverManager.getConnection(PrivateData.URL, PrivateData.USERNAME, PrivateData.PASSWORD);
             Statement statement = connection1.createStatement()) {

            //statement.execute("INSERT INTO users (name, email) VALUES ('Bob', 'bob@a.ru') ");

            //statement.execute("INSERT INTO users (name, age, email) VALUES ('Nastya', '36', 'asumka@mail.ru') ");

            //statement.executeUpdate("UPDATE users SET age='30' WHERE id='14' ");

            //ResultSet set = statement.executeQuery("SELECT * FROM users");








        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }



    }
}
