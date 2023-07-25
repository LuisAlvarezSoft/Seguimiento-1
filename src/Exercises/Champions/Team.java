package Exercises.Champions;

import javax.swing.*;

public class Team {
    public String FTeam;
    public String STeam;
    public Integer ScoreF;
    public Integer ScoreS;
    public String Ffecha;
    public String Sfecha;
    public String Tfecha;
    public void game(){
        System.out.println("En "+Ffecha+" los equipos: '"+FTeam+"' y '"+STeam+"' quedaron: "+ScoreF+" Contra "+ScoreS);
        System.out.println("En "+Sfecha+" los equipos: '"+FTeam+"' y '"+STeam+"' quedaron: "+ScoreF+" Contra "+ScoreS);
        System.out.println("En "+Tfecha+" los equipos: '"+FTeam+"' y '"+STeam+"' quedaron: "+ScoreF+" Contra "+ScoreS);
    }
}
