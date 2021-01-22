/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Utente implements Runnable{
    private boolean soddisfatto = false;
    private boolean stop = false;
    private Panino kebab;
    private int numero;

    public Utente(Panino kebab, int numero) {
        this.kebab = kebab;
        this.numero = numero;
    }

    public void run() {
        while (!stop) {
            while (!soddisfatto) {
                soddisfatto = kebab.prendiPanino();
                if (soddisfatto) {
                    System.out.println("THREAD SODDISFATTO: " + numero);
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }
    }

    public void termina() {
        stop = true;
    }
}
