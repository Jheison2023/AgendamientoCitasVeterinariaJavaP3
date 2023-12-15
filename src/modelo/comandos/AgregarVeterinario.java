package modelo.comandos;

import modelo.ClaseCentral;
import modelo.Veterinario;

public class AgregarVeterinario implements Comando {

    private Veterinario newVeterionario;
    private ClaseCentral obj;

    public AgregarVeterinario(ClaseCentral obj, Veterinario newVeterinario) {
        this.obj = obj;
        this.newVeterionario = newVeterinario;
    }

    public ClaseCentral getObj() {
        return obj;
    }

    public void setObj(ClaseCentral obj) {
        this.obj = obj;
    }

    public Veterinario getNewVeterionario() {
        return newVeterionario;
    }

    public void setNewVeterionario(Veterinario newVeterionario) {
        this.newVeterionario = newVeterionario;
    }

    @Override
    public void ejecutar() {
        this.obj.agregarVeterinario(newVeterionario);
    }

}
