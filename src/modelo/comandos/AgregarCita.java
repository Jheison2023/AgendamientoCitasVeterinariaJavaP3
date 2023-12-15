package modelo.comandos;

import modelo.*;

public class AgregarCita implements Comando {

    private Cita newCita;
    private ClaseCentral obj;

    public AgregarCita(ClaseCentral obj, Cita newCita) {
        this.obj = obj;
        this.newCita = newCita;
    }

    public ClaseCentral getObj() {
        return obj;
    }

    public void setObj(ClaseCentral obj) {
        this.obj = obj;
    }

    public Cita getNewCita() {
        return newCita;
    }

    public void setNewCita(Cita newCita) {
        this.newCita = newCita;
    }

    @Override
    public void ejecutar() {
        this.obj.agregarCita(newCita);
    }

}
