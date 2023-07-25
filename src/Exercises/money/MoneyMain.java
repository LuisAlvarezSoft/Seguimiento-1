package Exercises.money;

import javax.swing.*;

public class MoneyMain {
    public static void main(String[] args) {
        Money money = new Money();
        money.type=Integer.parseInt(JOptionPane.showInputDialog("Va a ingresar monedas o billetes?(1/2)"));
        money.pesa();
    }
}
