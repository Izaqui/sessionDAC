package dataBase;

import java.sql.DriverManager;

public class Connection {
    //Ususario e senha do banco
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";


    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/P";


    public static Connection createConnectionToMySQL() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }


    public static void main(String[] args) throws Exception {

        Connection con = createConnectionToMySQL();

        if (con != null) {
            System.out.println("Conexão obetida com sucesso!");
            con.close();
        }
    }

    private void close() {
    }
}