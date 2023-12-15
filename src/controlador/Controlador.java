package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import modelo.comandos.*;
import vista.*;

public class Controlador implements ActionListener {

    //Objetos
    private ClaseCentral obj;
    private ArrayList<Invocador> comandos;

    //Vistas
    private VistaPrincipal vistaP;
    private VistaAgregarCita vistaAC;
    private VistaAgregarVeterinario vistaAV;
    private VistaBuscarCita vistaBC;
    private VistaBuscarVeterinario vistaBV;

    //Controladores de las tablas
    private DefaultTableModel modeloTC;
    private DefaultTableModel modeloTV;

    public Controlador() throws SQLException {

        //Inicialización de objetos
        this.comandos = new ArrayList<>();
        this.obj = new ClaseCentral();

        this.vistaP = new VistaPrincipal();
        this.vistaAC = new VistaAgregarCita();
        this.vistaAV = new VistaAgregarVeterinario();
        this.vistaBC = new VistaBuscarCita();
        this.vistaBV = new VistaBuscarVeterinario();

        this.modeloTC = new DefaultTableModel();
        this.modeloTV = new DefaultTableModel();

        //Asignación de modelos para las tablas
        vistaP.getJtbl_Citas().setModel(modeloTC);
        vistaP.getJtbl_Veterinarios().setModel(modeloTV);

        //Agregación de columnas a las tablas
        modeloTC.addColumn("ID");
        modeloTC.addColumn("Estado");
        modeloTV.addColumn("ID");
        modeloTV.addColumn("Nombre");
        refrescarTablas();

        //Acciones de vista principal
        vistaP.getOpEjecutarComandos().addActionListener(this);
        vistaP.getOpFinalizarC().addActionListener(this);
        vistaP.getOpAgregarCita().addActionListener(this);
        vistaP.getOpAgregarVeterinario().addActionListener(this);
        vistaP.getOpBuscarCita().addActionListener(this);
        vistaP.getOpBuscarVeterinario().addActionListener(this);
        vistaP.getOpEliminarCita().addActionListener(this);
        vistaP.getOpEliminarVeterinario().addActionListener(this);
        vistaP.getJbtnCerrarPrograma().addActionListener(this);

        //Acciones de vista AgregarCita
        vistaAC.getJbtnCerrar().addActionListener(this);
        vistaAC.getJbtnRegistrar().addActionListener(this);
        vistaAC.getJbtnVolver().addActionListener(this);

        //Acciones de vista AgregarVeterinario
        vistaAV.getJbtnCerrar().addActionListener(this);
        vistaAV.getJbtnRegistrar().addActionListener(this);
        vistaAV.getJbtnVolver().addActionListener(this);

        //Acciones de vista BuscarCita
        vistaBC.getJbtnCerrar().addActionListener(this);
        vistaBC.getJbtnBuscar().addActionListener(this);
        vistaBC.getJbtnVolver().addActionListener(this);

        //Acciones de vista BuscarVeterinario
        vistaBV.getJbtnCerrar().addActionListener(this);
        vistaBV.getJbtnBuscar().addActionListener(this);
        vistaBV.getJbtnVolver().addActionListener(this);

    }

    public ClaseCentral getClaseCentral() {
        return obj;
    }

    public void setClaseCentral(ClaseCentral obj) {
        this.obj = obj;
    }

    public void agregarComandoAgregarCita(Cita newCita) {
        comandos.add(new Invocador(new AgregarCita(obj, newCita)));
    }

    public void agregarComandoAgregarVeterinario(Veterinario newVeterinario) {
        comandos.add(new Invocador(new AgregarVeterinario(obj, newVeterinario)));
    }

    public void agregarComandoEliminarCita(String numID) {
        comandos.add(new Invocador(new EliminarCita(obj, numID)));
    }

    public void agregarComandoEliminarVeterinario(String numID) {
        comandos.add(new Invocador(new EliminarVeterinario(obj, numID)));
    }

    public void agregarComandoFinalizarCita(String numID) {
        comandos.add(new Invocador(new FinalizarCita(obj, numID)));
    }

    public void ejecutarComandos() {
        if (!comandos.isEmpty()) {
            for (Invocador i : comandos) {
                i.start();
            }
            JOptionPane.showMessageDialog(null, "Todos los comandos ejecutados", "Ejecución de comandos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista de comandos vacía", "Ejecución de comandos", JOptionPane.INFORMATION_MESSAGE);
        }
        comandos = new ArrayList<>();
        refrescarTablas();
    }

    public void llenarTablaCitas() {
        for (int i = 0; i < obj.getCitas().size(); i++) {
            modeloTC.addRow(new Object[]{obj.getCitas().get(i).getNumID(), obj.getCitas().get(i).getEstado()});
        }
    }

    public void borrarFilasCitas() {

        int filas = modeloTC.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modeloTC.removeRow(i);
        }
    }

    public void llenarTablaVeterinarios() {
        for (int i = 0; i < obj.getVeterinarios().size(); i++) {
            modeloTV.addRow(new Object[]{obj.getVeterinarios().get(i).getNumID(), obj.getVeterinarios().get(i).getNombre()});
        }
    }

    public void borrarFilasVeterinarios() {

        int filas = modeloTV.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modeloTV.removeRow(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (vistaP.getOpAgregarCita() == e.getSource()) {
            vistaP.setVisible(false);
            vistaAC.setVisible(true);
        } else if (vistaP.getOpBuscarCita() == e.getSource()) {
            vistaP.setVisible(false);
            vistaBC.setVisible(true);
        } else if (vistaP.getOpEliminarCita() == e.getSource()) {
            String numID = JOptionPane.showInputDialog("Ingrese el ID de la cita que desea eliminar");
            if (obj.encontrarCitaID(numID) != null) {
                agregarComandoEliminarCita(numID);
                JOptionPane.showMessageDialog(null, "Comando de eliminar cita agregado", "Eliminar cita", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra ninguna cita registrada con el ID ingresado", "Eliminar cita", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (vistaP.getOpFinalizarC() == e.getSource()) {
            String numID = JOptionPane.showInputDialog("Ingrese el ID de la cita que desea finalizar");
            if (obj.encontrarCitaID(numID) != null) {
                agregarComandoFinalizarCita(numID);
                JOptionPane.showMessageDialog(null, "Comando de finalizar cita agregado", "Finalizar cita", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra ninguna cita registrada con el ID ingresado", "Finalizar cita", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (vistaP.getOpAgregarVeterinario() == e.getSource()) {
            vistaP.setVisible(false);
            vistaAV.setVisible(true);
        } else if (vistaP.getOpBuscarVeterinario() == e.getSource()) {
            vistaP.setVisible(false);
            vistaBV.setVisible(true);
        } else if (vistaP.getOpEliminarVeterinario() == e.getSource()) {
            String numID = JOptionPane.showInputDialog("Ingrese el ID del veterinario que desea eliminar");
            if (obj.encontrarVeterinarioID(numID) != null) {
                agregarComandoEliminarVeterinario(numID);
                JOptionPane.showMessageDialog(null, "Comando de eliminar veterinario agregado", "Eliminar veterinario", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra ningun veterinario registrado con el ID ingresado", "Eliminar veterinario", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (vistaP.getOpEjecutarComandos() == e.getSource()) {
            ejecutarComandos();
        } else if (vistaP.getJbtnCerrarPrograma() == e.getSource()) {
            System.exit(0);
        } else if (vistaAC.getJbtnCerrar() == e.getSource()) {
            System.exit(0);
        } else if (vistaAC.getJbtnVolver() == e.getSource()) {
            vistaAC.setVisible(false);
            vistaP.setVisible(true);
        } else if (vistaAC.getJbtnRegistrar() == e.getSource()) {
            try {
                if (obj.encontrarCitaID(vistaAC.getJtf_ID().getText()) != null) {
                    JOptionPane.showMessageDialog(null, "Ya se encuentra una cita registrada con el ID ingresado", "Registrar cita", JOptionPane.INFORMATION_MESSAGE);
                } else if (obj.encontrarVeterinarioID(vistaAC.getJtf_IDVeterinario().getText()) == null) {
                    JOptionPane.showMessageDialog(null, "No se encuentra ningún veterinario registrado con el ID ingresado", "Asignar veterinario", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String numIDCita = vistaAC.getJtf_ID().getText();
                    String fecha = vistaAC.getJtf_fecha().getText();
                    String nombreCliente = vistaAC.getJtf_NombreCliente().getText();
                    String teléfonoCliente = vistaAC.getJtf_TeléfonoCliente().getText();
                    String correoCliente = vistaAC.getJtf_CorreoCliente().getText();
                    String numIDVeterinario = vistaAC.getJtf_IDVeterinario().getText();
                    String nombreMascota = vistaAC.getJtf_nombreMascota().getText();
                    String tipoAnimal = vistaAC.getJtf_tipoAnimal().getText();

                    Cliente newCliente = new Cliente(nombreCliente, teléfonoCliente, correoCliente);
                    Veterinario veterinario = obj.encontrarVeterinarioID(numIDVeterinario);
                    Mascota newMascota = new Mascota(nombreMascota, tipoAnimal);
                    Cita newCita = new Cita(numIDCita, fecha, "Pendiente", newCliente, veterinario, newMascota);
                    agregarComandoAgregarCita(newCita);
                    JOptionPane.showMessageDialog(null, "Comando de registrar cita agregado", "Registrar cita", JOptionPane.INFORMATION_MESSAGE);
                }
                limpiarCampos();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (vistaAV.getJbtnCerrar() == e.getSource()) {
            System.exit(0);
        } else if (vistaAV.getJbtnVolver() == e.getSource()) {
            vistaAV.setVisible(false);
            vistaP.setVisible(true);
        } else if (vistaAV.getJbtnRegistrar() == e.getSource()) {
            if (obj.encontrarVeterinarioID(vistaAV.getJtf_ID().getText()) != null) {
                JOptionPane.showMessageDialog(null, "Ya se encuentra un veterinario registrado con el ID ingresado", "Registrar veterinario", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String numID = vistaAV.getJtf_ID().getText();
                String nombre = vistaAV.getJtf_Nombre().getText();
                String teléfono = vistaAV.getJtf_Teléfono().getText();
                String correo = vistaAV.getJtf_Correo().getText();
                Veterinario newVeterinario = new Veterinario(numID, nombre, teléfono, correo);
                agregarComandoAgregarVeterinario(newVeterinario);
                JOptionPane.showMessageDialog(null, "Comando de registrar veterinario agregado", "Registrar veterinario", JOptionPane.INFORMATION_MESSAGE);
            }
            limpiarCampos();
        } else if (vistaBC.getJbtnCerrar() == e.getSource()) {
            System.exit(0);
        } else if (vistaBC.getJbtnVolver() == e.getSource()) {
            vistaBC.setVisible(false);
            vistaP.setVisible(true);
        } else if (vistaBC.getJbtnBuscar() == e.getSource()) {
            if (obj.encontrarCitaID(vistaBC.getJtf_ID().getText()) != null) {
                Cita cita = obj.encontrarCitaID(vistaBC.getJtf_ID().getText());
                vistaBC.getJta_DatosCita().setText(cita.datosCita());
                vistaBC.getJta_DatosCliente().setText(cita.datosCliente());
                vistaBC.getJta_DatosMascota().setText(cita.datosMascota());
                vistaBC.getJta_DatosVeterinario().setText(cita.datosVeterinario());
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra ninguna cita registrada con el ID ingresado", "Buscar cita", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (vistaBV.getJbtnCerrar() == e.getSource()) {
            System.exit(0);
        } else if (vistaBV.getJbtnVolver() == e.getSource()) {
            vistaBV.setVisible(false);
            vistaP.setVisible(true);
        } else if (vistaBV.getJbtnBuscar() == e.getSource()) {
            if (obj.encontrarVeterinarioID(vistaBV.getJtf_ID().getText()) != null) {
                Veterinario veterinario = obj.encontrarVeterinarioID(vistaBV.getJtf_ID().getText());
                vistaBV.getJta_DatosVeterinario().setText(veterinario.datosVeterinario());
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra ningún veterinario registrado con el ID ingresado", "Buscar veterinario", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void refrescarTablas() {
        borrarFilasCitas();
        borrarFilasVeterinarios();
        llenarTablaCitas();
        llenarTablaVeterinarios();
    }

    public void limpiarCampos() {
        vistaAC.getJtf_CorreoCliente().setText("");
        vistaAC.getJtf_ID().setText("");
        vistaAC.getJtf_IDVeterinario().setText("");
        vistaAC.getJtf_NombreCliente().setText("");
        vistaAC.getJtf_TeléfonoCliente().setText("");
        vistaAC.getJtf_fecha().setText("");
        vistaAC.getJtf_nombreMascota().setText("");
        vistaAC.getJtf_tipoAnimal().setText("");

        vistaAV.getJtf_Correo().setText("");
        vistaAV.getJtf_ID().setText("");
        vistaAV.getJtf_Nombre().setText("");
        vistaAV.getJtf_Teléfono().setText("");

        vistaBC.getJtf_ID().setText("");
        vistaBC.getJta_DatosCita().setText("");
        vistaBC.getJta_DatosCliente().setText("");
        vistaBC.getJta_DatosMascota().setText("");
        vistaBC.getJta_DatosVeterinario().setText("");

        vistaBV.getJtf_ID().setText("");
        vistaBV.getJta_DatosVeterinario().setText("");
    }

    public void Run() {
        vistaP.setVisible(true);
    }

}
