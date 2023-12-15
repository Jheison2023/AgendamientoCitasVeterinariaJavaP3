package modelo.comandos;

import modelo.ClaseCentral;

public class FinalizarCita implements Comando {

    private ClaseCentral obj;
    private String numID;

    public FinalizarCita(ClaseCentral obj, String numID) {
        this.obj = obj;
        this.numID = numID;
    }

    public ClaseCentral getObj() {
        return obj;
    }

    public void setObj(ClaseCentral obj) {
        this.obj = obj;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    @Override
    public void ejecutar() {
        this.obj.finalizarCita(numID);
    }
}
