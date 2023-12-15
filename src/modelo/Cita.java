package modelo;

public class Cita {

    private String numID;
    private String fecha;
    private String estado;
    private Cliente cliente;
    private Veterinario veterinario;
    private Mascota mascota;

    public Cita(String numID, String fecha, String estado, Cliente cliente, Veterinario veterinario, Mascota mascota) {
        this.numID = numID;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String datosCita() {
        return "ID:" + numID + "\n"
                + "Fecha: " + fecha;
    }

    public String datosCliente() {
        return "Nombre: " + cliente.getNombre() + "\n"
                + "Correo: " + cliente.getCorreo() + "\n"
                + "Teléfono: " + cliente.getTelefono() + "\n";
    }

    public String datosVeterinario() {
        return "ID: " + veterinario.getNumID() + "\n"
                + "Nombre: " + veterinario.getNombre() + "\n"
                + "Correo: " + veterinario.getCorreo() + "\n"
                + "Teléfono: " + veterinario.getTelefono() + "\n";
    }

    public String datosMascota() {
        return "Nombre: " + mascota.getNombre() + "\n"
                + "Tipo de animal: " + mascota.getTipoAnimal();
    }

}
