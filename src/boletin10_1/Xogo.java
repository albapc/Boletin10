package boletin10_1;

import javax.swing.JOptionPane;

public class Xogo {

    private int numAdivinar;
    private int numAdivinar1;
    private int numIntentos;
    private int i;

    public void introducirDatos() {
        do{
        numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un "
                + "número a adiviñar:"));            
        } while (numAdivinar<1 || numAdivinar>50);

        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o "
                + "número máximo de intentos:"));
    }

    public void averiguarNumeros() {
            for (i = 1; i <= numIntentos; i++) {
            numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un "
                    + "número:"));
            
            if (numAdivinar1 < numAdivinar) {
                JOptionPane.showMessageDialog(null, "É un número maior");
            } else if (numAdivinar1 > numAdivinar){
                JOptionPane.showMessageDialog(null, "É un número menor");
            } else if (numAdivinar1 == numAdivinar) {
                JOptionPane.showMessageDialog(null, "Acertaches");
            }
            
            if(i == numIntentos){
                JOptionPane.showMessageDialog(null, "Agotaches o número de intentos");      
        }   
            }
        }
    }

