/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

/**
 *
 * @author danie
 */
public class Kebabbaro extends Thread{
    private Panino kebab;

    public Kebabbaro(Panino kebab) {
        this.kebab = kebab;
    }
    
    public void run(){
        prepara();
        kebab.paninoPronto();
    }
    public void prepara(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {}
    }
}
