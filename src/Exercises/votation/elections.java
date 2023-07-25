package Exercises.votation;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;

public class elections {
    public int AnaTotal;
    public int DiegoTotal;
    public Integer vote;
    public int actual;
    public void voting(){
        while(actual<=10){
            vote=Integer.parseInt(JOptionPane.showInputDialog("Por quien quiere votar, ana o diego?(1/2)"));
            if(vote.equals(1)){
                AnaTotal++;
                actual++;

            }
            else if (vote.equals(2)){
                DiegoTotal++;
                actual++;

            }else{
                System.out.println("Ingrese una opcion valida");
            }
        } if (actual>10){
            if(AnaTotal<DiegoTotal){
                System.out.println("El ganador es diego");

            }
            else if (AnaTotal>DiegoTotal){
                System.out.println("El ganador es Ana");
            }else{
                System.out.println("Es un empate");
            }
        }
    }
}
