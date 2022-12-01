package practicaprogramada11;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class PracticaProgramada11 {

    public static void main(String[] args) {
        int jugadores[][] = new int[3][11];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                jugadores[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pases"));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("\t" + jugadores[i][j]);
            }
            System.out.println("");
        }

    }

}
