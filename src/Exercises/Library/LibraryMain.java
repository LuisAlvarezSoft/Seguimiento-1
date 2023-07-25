package Exercises.Library;

import javax.swing.*;

public class LibraryMain {
    public static void main(String[] args) {
    LibraryCode order = new LibraryCode();
    order.type=Integer.parseInt(JOptionPane.showInputDialog("¿Es devolucion o perdida?(1/2)"));
    order.sue();
    }
}
