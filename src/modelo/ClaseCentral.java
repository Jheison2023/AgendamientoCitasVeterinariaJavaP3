package modelo;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClaseCentral {
    
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Cita> citas;
    private Conexión baseDatos;
    
    public ClaseCentral() throws SQLException {
        this.veterinarios = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.baseDatos = new Conexión();
        
        this.veterinarios = this.baseDatos.extraerVeterinariosGuardados();
        this.citas = this.baseDatos.extraerCitasGuardadas();
        
    }
    
    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
    
    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
    
    public ArrayList<Cita> getCitas() {
        return citas;
    }
    
    public void setCitas(ArrayList<Cita> citasProgramadas) {
        this.citas = citasProgramadas;
    }
    
    public Conexión getBaseDatos() {
        return baseDatos;
    }
    
    public void setBaseDatos(Conexión baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    public void agregarVeterinario(Veterinario newVeterinario) {
        this.veterinarios.add(newVeterinario);
        this.baseDatos.agregarVeterinario(newVeterinario);
    }
    
    public void eliminarVeterinarioID(String numID) {
        for (int i = 0; i < this.veterinarios.size(); i++) {
            if (this.veterinarios.get(i).getNumID().equals(numID)) {
                this.veterinarios.remove(i);
                this.baseDatos.eliminarVeterinario(numID);
                break;
            }
        }
    }
    
    public Veterinario encontrarVeterinarioID(String numID) {
        for (Veterinario v : veterinarios) {
            if (v.getNumID().equals(numID)) {
                return v;
            }
        }
        return null;
    }
    
    public void agregarCita(Cita newCita) {
        this.citas.add(newCita);
        this.baseDatos.agregarCita(newCita);
    }
    
    public void eliminarCitaID(String numID) {
        for (int i = 0; i < this.citas.size(); i++) {
            if (this.citas.get(i).getNumID().equals(numID)) {
                this.citas.remove(i);
                this.baseDatos.eliminarCitaID(numID);
                break;
            }
        }
    }
    
    public Cita encontrarCitaID(String numID) {
        for (Cita c : citas) {
            if (c.getNumID().equals(numID)) {
                return c;
            }
        }
        return null;
    }
    
    public void finalizarCita(String numID) {
        for (Cita c : citas) {
            if (c.getNumID().equals(numID)) {
                c.setEstado("Finalizada");
                this.baseDatos.finalizarCita(numID);
                break;
            }
        }
    }
    
}
