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
public class Simulation {

    static Couleur[] allColors = {
        Couleur.YELLOW,
        Couleur.BLUE,
        Couleur.RED,
        Couleur.BLUE,
        Couleur.YELLOW,
        Couleur.RED
    };
    static ChameneosClass[] TheChameneos = new ChameneosClass[allColors.length];

    public static void main(String args[]) {
        try {
            MallClass mall = new MallClass();
            for (int i = 0; i < allColors.length; i++) {
                TheChameneos[i] = new ChameneosClass(mall, new IdChameneos(i), allColors[i]);
            }
            for (int i = 0; i < allColors.length; i++) {
                TheChameneos[i].start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
