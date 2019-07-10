/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztresportres;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class MatriztresporTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] Array1;
        Array1 = new String[3][3];

        for (int j = 0; j < Array1.length; j++) {
            System.out.print("\n");
            for (String[] Array11 : Array1) {
                String numero = JOptionPane.showInputDialog("Matriz ");
                Array11[j] = numero;
                System.out.print("\t" + Array11[j]);
            }
        }
        String buscar = JOptionPane.showInputDialog("Que numero quiere buscar");
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1.length; j++) {
                if (buscar.equals(Array1[i][j])) {

                    JOptionPane.showMessageDialog(null, "Numero " + " encontrado en la posicion" + "[" + j + "]" + "[" + i + "]");
                }
            }
        }
    }

}
