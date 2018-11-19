package boletin10_2;

import javax.swing.JOptionPane;

public class Aleatorio {

    private int numAdivinar;
    private int numAdivinar1;

    public void averiguarNumeros() {
        numAdivinar = (int) (Math.random() * 50) + 1;
        do {
            numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un "
                    + "número entre 1 e 50:"));

            if (numAdivinar1 == numAdivinar) {
                JOptionPane.showMessageDialog(null, "Acertaches");
                break;
            } else if (Math.abs(numAdivinar1 - numAdivinar) > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            } else if (Math.abs(numAdivinar1 - numAdivinar) >= 10 && Math.abs(numAdivinar - numAdivinar) <= 20) {
                JOptionPane.showMessageDialog(null, "Lonxe");
            } else if (Math.abs(numAdivinar1 - numAdivinar) < 10 && Math.abs(numAdivinar - numAdivinar) > 5) {
                JOptionPane.showMessageDialog(null, "Preto");
            } else if (Math.abs(numAdivinar1 - numAdivinar) <= 5) {
                JOptionPane.showMessageDialog(null, "Moi preto");
            }
        } while (numAdivinar1 != numAdivinar);
    }
}
