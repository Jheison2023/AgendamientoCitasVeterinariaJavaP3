package modelo.comandos;

import modelo.ClaseCentral;

public class EliminarVeterinario implements Comando {

    private String numID;
    private ClaseCentral obj;

    public EliminarVeterinario(ClaseCentral obj, String numID) {
        this.numID = numID;
        this.obj = obj;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public ClaseCentral getObj() {
        return obj;
    }

    public void setObj(ClaseCentral obj) {
        this.obj = obj;
    }

    @Override
    public void ejecutar() {
        this.obj.eliminarVeterinarioID(numID);
    }

}
