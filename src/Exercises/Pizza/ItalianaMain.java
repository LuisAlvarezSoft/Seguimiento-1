package Exercises.Pizza;

import javax.swing.*;

public class ItalianaMain {
    public static void main(String[] args) {
        ItalianaPizza order= new ItalianaPizza();
        order.type=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea ordenar? ¿Pizza, sandwich o ensalada? (1/2/3)"));
        order.quantity=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas porciones desea?"));
        order.Pending();
    }
}
