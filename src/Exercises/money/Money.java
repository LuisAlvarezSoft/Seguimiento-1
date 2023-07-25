package Exercises.money;

import javax.swing.*;

public class Money {
    public Integer type;
    public Integer coin;
    public Integer billete;
    public void pesa(){
        switch (type){
            case 1:{
                coin=Integer.parseInt(JOptionPane.showInputDialog("Cuantas dinero en monedas va a ingresar?(solo de 500 o 1000)"));
                if(coin % 500 == 0){
                    System.out.println("Su devuelta es: "+(coin-500)+"\nvuelva pronto!");
                }
                else{
                    System.out.println("Ingrese solo monedas de 500 o 1000");
                }
            }
            case 2:{
                billete=Integer.parseInt(JOptionPane.showInputDialog("que billete va a ingresar? va a ingresar?(solo de 500 o 1000)"));
                if(billete % 2000 == 0 || billete % 5000 == 0){
                    System.out.println("Su devuelta es: "+(billete-500)+"\nvuelva pronto!");
                }
                else{
                    System.out.println("Ingrese solo billetes de 2000 o 5000");
                }
            }
        }
    }
}
