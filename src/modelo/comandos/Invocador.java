package modelo.comandos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Invocador extends Thread {

    private Comando comando;

    public Invocador(Comando comando) {
        this.comando = comando;
    }

    public Comando getComando() {
        return comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void run() {
        comando.ejecutar();
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Invocador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
