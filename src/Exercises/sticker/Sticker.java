package Exercises.sticker;
import javax.swing.*;

public class Sticker {
    public Integer Size;
    public Integer Quantity;
    public void MinimumQuantity(){
        while(Quantity<10){
            Quantity=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos stickers va a imprimir?(Min. 10)"));
        }
    }
    public void Factory(){
        switch (Size){
            case 1->{
                MinimumQuantity();
                System.out.println("El precio a pagar es: "+Quantity*4000);
            }
            case 2->{
                MinimumQuantity();
                System.out.println("El precio a pagar es: "+Quantity*6000);
            }
        }
    }
}
