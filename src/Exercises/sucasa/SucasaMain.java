package Exercises.sucasa;
import javax.swing.*;
public class SucasaMain {
    public static void main(String[] args) {
        Sucasa x = new Sucasa();
        x.price=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del inmueble: "));
        x.type= JOptionPane.showInputDialog("¿Es nuevo o usado?(Digitar)");
        x.commission();
    }
}
