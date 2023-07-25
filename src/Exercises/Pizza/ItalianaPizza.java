package Exercises.Pizza;
import javax.swing.*;

public class ItalianaPizza {
    public Integer type;
    public Integer quantity;
    public Integer sauce;
    public void Pending(){
   switch (type){
            case 1:{
                sauce=Integer.parseInt(JOptionPane.showInputDialog("¿Desea salsa? (1 para agregar)"));
                if(sauce.equals(1)){
                    System.out.println("El total a pagar es: "+(quantity*7000+3000));
                    break;
                }
                else{
                    System.out.println("El total a pagar es: "+quantity*7000);
                    break;
                }
            }
            case 2:{
                sauce=Integer.parseInt(JOptionPane.showInputDialog("¿Desea salsa? (1 para agregar)"));
                if(sauce.equals(1)){
                    System.out.println("El total a pagar es: "+(quantity*5000+3000));
                break;
                }
                else{
                    System.out.println("El total a pagar es: "+quantity*5000);
                break;
                }
            }
            case 3:{
                sauce=Integer.parseInt(JOptionPane.showInputDialog("¿Desea salsa? (1 para agregar)"));
                if(sauce.equals(1)){
                    System.out.println("El total a pagar es: "+(quantity*15000+3000));
                break;
                }
                else{
                    System.out.println("El total a pagar es: "+quantity*15000);
                break;
                }
            }
            default:
                System.out.println("Eso no es una opcion en el menú");
        }
    }
}
