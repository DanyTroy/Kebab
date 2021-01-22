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
public class Kebab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Panino kebab = new Panino();
        Thread t[] = new Thread[20];
        Thread kebabbaro = new Kebabbaro(kebab);
        for (int i = 0; i < 20; i++) {
            t[i] = new Thread(new Utente(kebab, i));
        }
        
        kebabbaro.start();
        for (int i = 0; i < 20; i++) {
            t[i].start();
        }
    }

}