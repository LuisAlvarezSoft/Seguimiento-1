package Exercises.sticker;
import javax.swing.*;

public class StickerMain {
    public static void main(String[] args) {
        Sticker sticker = new Sticker();
        sticker.Quantity=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos stickers va a imprimir?"));
        sticker.Size=Integer.parseInt(JOptionPane.showInputDialog("¿Los stickers son pequeños o grandes?(1/2)"));
        sticker.Factory();
    }
}
