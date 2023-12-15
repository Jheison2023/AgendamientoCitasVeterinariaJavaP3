package main;

import controlador.Controlador;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Controlador c = new Controlador();
        c.Run();
    }
}
