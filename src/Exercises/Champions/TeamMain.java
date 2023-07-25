package Exercises.Champions;

import javax.swing.*;

public class TeamMain {
    public static void main(String[] args) {
    Team team = new Team();
        team.FTeam= JOptionPane.showInputDialog("Cual es el nombre del primer equipo");
        team.STeam= JOptionPane.showInputDialog("Cual es el nombre del segundo equipo");
        team.ScoreF= Integer.parseInt(JOptionPane.showInputDialog("Cual es el marcador del primer equipo"));
        team.ScoreS= Integer.parseInt(JOptionPane.showInputDialog("Cual es el marcador del segundo equipo"));
        team.Ffecha=JOptionPane.showInputDialog("Cual es la primera fecha?");
        team.Sfecha=JOptionPane.showInputDialog("Cual es la segunda fecha?");
        team.Tfecha=JOptionPane.showInputDialog("Cual es la tercera fecha?");
    }
}
