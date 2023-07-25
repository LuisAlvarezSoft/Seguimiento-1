package Exercises.lavanYa;

import javax.swing.*;

public class LavanMain {
    public static void main(String[] args) {
        LavanYa Washer = new LavanYa();
        Washer.ClothesNumber=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de prendas"));
        Washer.Service=JOptionPane.showInputDialog("¿Que servicio desea? (lavado o planchado).");
        Washer.Laundry();
    }
}
