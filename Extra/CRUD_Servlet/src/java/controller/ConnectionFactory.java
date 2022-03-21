
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private static final String url = "jdbc:mysql://localhost:3306/psmsdb";
    private static final String user = "root";
    private static final String senha = "";

    /**
     *
     * @return @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver"); // registra o DRIVER        
        Connection conexao = DriverManager.getConnection(url, user, senha);
        return conexao;
    }
}
