package modelo;

public class Veterinario extends DatosPersonales {

    private String numID;

    public Veterinario(String numID, String nombre, String telefono, String correo) {
        super(nombre, telefono, correo);
        this.numID = numID;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String datosVeterinario() {
        return "ID: " + getNumID() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Teléfono: " + getTelefono() + "\n";
    }

}
