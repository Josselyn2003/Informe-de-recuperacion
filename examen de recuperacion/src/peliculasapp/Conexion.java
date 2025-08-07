package peliculasapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cine_db",
                    "root",
                    "Josselyn1104"
            );
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
