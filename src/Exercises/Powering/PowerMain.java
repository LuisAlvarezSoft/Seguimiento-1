package Exercises.Powering;

import javax.swing.*;
import java.awt.*;

public class PowerMain {
    public static void main(String[] args) {
    Power power = new Power();
    power.number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
    power.MultiplicationTables();
    }
}
