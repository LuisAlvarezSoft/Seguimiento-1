package Exercises.test;

import javax.swing.*;

public class TestMain {
    public static void main(String[] args) {
    Test test = new Test();
        test.q1=JOptionPane.showInputDialog("¿Cuantas patas tiene una araña?\na.8\nb.7\nc.9\nd.15");
        test.q2=JOptionPane.showInputDialog("¿Cual es el rio mas caudaloso del mundo?\na.Amazonas\nb.Rio verde\nc.Barragan\nd.Ninguna de las anteriores");
        test.q3=JOptionPane.showInputDialog("Cada cuántos años tenemos un año bisiesto?\na.8\nb.4\nc.5\nd.2");
        test.q4=JOptionPane.showInputDialog("¿Cuántos meses tienen 28 días?\na.12\nb.5\nc.3\nd.1");
        test.q5=JOptionPane.showInputDialog("¿Qué planeta es el más cercano al Sol?\na.Venus\nb.Mercurio\nc.Marte\nd.Jupiter");
        test.testing();
    }
}
