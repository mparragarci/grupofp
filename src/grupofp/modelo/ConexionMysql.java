package grupofp.modelo;

import java.sql.*;

public class ConexionMysql {

    private final String base = "OnlineStore";
    private final String user = "root";
    private final String password = "password";
    private final String url = "jbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConexion() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
        } catch(SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
