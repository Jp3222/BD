package Prueba;

import com.jsql.conexion.Conexion;
import java.sql.SQLException;

public class Main {

    public static final String Productos[] = {
        "ID",
        "Clave",
        "Nombre",
        "Marca",
        "Contenido",
        "UDM",
        "Precio"
    };

    public static void main(String[] args) throws SQLException {
        Conexion cn = Conexion.getInstancia("jp", "12345", Conexion.getLOCAL_URL("3306", "jshop"));
        System.out.println(cn.isConexion());

    }
}
