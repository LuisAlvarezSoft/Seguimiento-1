package Exercises.triangle;

import javax.swing.*;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño del primer lado?"));
        triangle.side2=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño del segundo lado?"));
        triangle.side3=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño del tercer lado?"));
        triangle.equi();
    }
}
