package Exercises.Library;

import javax.swing.*;

public class LibraryCode {
    public Integer type;
    public Integer days;
    public Integer Books;
    public Integer magazines;
    public void sue(){
        switch (type){
            default:{
                System.out.println("Indique una opcion valida");
            }
            case 1:{
                days=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de dias de demora."));
                Books=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de libros"));
                magazines=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de revistas"));
                System.out.println("La cantidad total a pagar es: "+((500*magazines*days)+(days*600*Books)));
                break;
            }
            case 2:{
                Books=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de libros"));
                magazines=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de revistas"));
                System.out.println("La cantidad total a pagar es: "+((Books+magazines)*10000));
                break;
            }
        }
    }
}
