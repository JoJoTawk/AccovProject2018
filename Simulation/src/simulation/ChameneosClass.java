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
public class ChameneosClass extends Thread {

    private MallClass mall;
    private IdChameneos idCham;
    private Couleur myColour, otherColour;

    public ChameneosClass(MallClass m, IdChameneos idCham, Couleur c) {
        this.mall = m;
        this.idCham = idCham;
        this.myColour = c;
    }

    private void Message(String message) {
        System.out.println("(" + idCham.toString() + ") I am " + myColour.toString() + " and " + message);
    }

    private void EatingHoneysuckleAndTraining() {
        Message("I am Eating Honey suckle and Training");
    }

    private void GoingToTheMall() {
        Message("I am going to the mall");
    }

    private void Mutating() {
        Message("I am going to mute");
        otherColour = mall.Cooperation(idCham, myColour);
        myColour = myColour.ComplementaryColour(otherColour);
        Message("I have done a mutation");
    }

    public void run() {
        while (true) {
            EatingHoneysuckleAndTraining();
            GoingToTheMall();
            Mutating();
        }
    }
}

