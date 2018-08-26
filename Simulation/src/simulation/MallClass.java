/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author Jhonny Tawk
 */
public class MallClass {

    private Couleur ColorA, ColorB;
    private boolean shouldWait = false;
    private boolean firstCall = true;

    public synchronized Couleur Cooperation(IdChameneos idCham, Couleur color) {
        Couleur result ;
        while (shouldWait) {
            try {
                wait();
            } catch (InterruptedException e) {
            }}
            if (firstCall) {
                ColorA = color;
                firstCall = false;
                while (!firstCall) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                shouldWait = false;
                result = ColorB;
                notifyAll();
            } else {
                ColorB = color;
            
            result = ColorA;
            firstCall = true;
            shouldWait = true;
            notifyAll();
        
            }
        return result;
    }
}
