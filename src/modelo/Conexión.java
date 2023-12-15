package modelo;

import com.mysql.cj.jdbc.StatementImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexión {

    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String paswword = "";
    private static final String url = "jdbc:mysql://localhost/proyecto";

    public Conexión() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, paswword);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() {
        con = null;
    }

    public void agregarCita(Cita newCita) {
        String SSQL = "INSERT INTO citas VALUES('"
                + newCita.getNumID()
                + "', '"
                + newCita.getFecha()
                + "', '"
                + newCita.getEstado()
                + "', '"
                + newCita.getCliente().getNombre()
                + "', '"
                + newCita.getCliente().getTelefono()
                + "', '"
                + newCita.getCliente().getCorreo()
                + "', '"
                + newCita.getVeterinario().getNumID()
                + "', '"
                + newCita.getVeterinario().getNombre()
                + "', '"
                + newCita.getVeterinario().getTelefono()
                + "', '"
                + newCita.getVeterinario().getCorreo()
                + "', '"
                + newCita.getMascota().getNombre()
                + "', '"
                + newCita.getMascota().getTipoAnimal()
                + "')";

        try {

            StatementImpl s = (StatementImpl) getConnection().createStatement();
            s.executeUpdate(SSQL);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void eliminarCitaID(String numID) {

        String SSQL = "DELETE FROM citas WHERE numIDCita = '" + numID + "'";

        try {

            StatementImpl s = (StatementImpl) getConnection().createStatement();
            s.executeUpdate(SSQL);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ArrayList<Cita> extraerCitasGuardadas() throws SQLException {
        StatementImpl s = (StatementImpl) getConnection().createStatement();
        String SSQL = "SELECT * FROM citas";
        ResultSet rs = s.executeQuery(SSQL);

        Cita cita;
        ArrayList<Cita> citasGuardadas = new ArrayList<>();

        while (rs.next()) {
            cita = new Cita(rs.getString(1), rs.getString(2), rs.getString(3),
                    new Cliente(rs.getString(4), rs.getString(5), rs.getString(6)),
                    new Veterinario(rs.getString(6), rs.getString(6), rs.getString(9), rs.getString(10)),
                    new Mascota(rs.getString(11), rs.getString(12)));
            citasGuardadas.add(cita);
        }

        return citasGuardadas;
    }

    public void agregarVeterinario(Veterinario newVeterinario) {

        String SSQL = "INSERT INTO veterinarios VALUES('"
                + newVeterinario.getNumID()
                + "', '"
                + newVeterinario.getNombre()
                + "', '"
                + newVeterinario.getTelefono()
                + "', '"
                + newVeterinario.getCorreo()
                + "')";

        try {

            StatementImpl s = (StatementImpl) getConnection().createStatement();
            s.executeUpdate(SSQL);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarVeterinario(String numID) {

        String SSQL = "DELETE FROM veterinarios WHERE ID = '" + numID + "'";

        try {

            StatementImpl s = (StatementImpl) getConnection().createStatement();
            s.executeUpdate(SSQL);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ArrayList<Veterinario> extraerVeterinariosGuardados() throws SQLException {
        StatementImpl s = (StatementImpl) getConnection().createStatement();
        String SSQL = "SELECT * FROM veterinarios";
        ResultSet rs = s.executeQuery(SSQL);

        Veterinario veterinario;
        ArrayList<Veterinario> veterinariosGuardados = new ArrayList<>();

        while (rs.next()) {
            veterinario = new Veterinario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            veterinariosGuardados.add(veterinario);
        }

        return veterinariosGuardados;
    }

    public void finalizarCita(String numID) {
        String SSQL = "UPDATE citas SET estado =" + "'Finalizada'" + " WHERE numIDCita = " + numID;

        try {

            StatementImpl s = (StatementImpl) getConnection().createStatement();
            s.executeUpdate(SSQL);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }
    }

}
