package Exercises.Concecionary;

import com.sun.tools.javac.Main;

import javax.swing.*;

public class CodeMain {
    public static void main(String[] args) {
    Code code = new Code();
    code.type=Integer.parseInt(JOptionPane.showInputDialog("Chevrolet, mazda o renault?(1/2/3)"));
    code.selling();
    }
}
