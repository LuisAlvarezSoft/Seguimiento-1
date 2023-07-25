package Exercises.lavanYa;
import javax.swing.*;

public class LavanYa {
    public String Service;
    public String SubType;
    public Integer ClothesNumber;
    public void Laundry(){

        switch (Service){
            case "lavado" -> {SubType=JOptionPane.showInputDialog("¿Desea lavado en seco o normal?(digitar solo seco o normal)");
                switch (SubType) {
                    case "seco" -> {
                        System.out.println("La cantidad total a cancelar es: " + (ClothesNumber * 2000));
                    }
                    case "normal" -> {
                        System.out.println("La cantidad total a cancelar es: " + (ClothesNumber * 1500));
                    }
                }
            }
            case "planchado" -> {
                System.out.println("La cantidad total a cancelar es (con el domicilio): "+(ClothesNumber*1800+3000));
            }
        }
    }
}
