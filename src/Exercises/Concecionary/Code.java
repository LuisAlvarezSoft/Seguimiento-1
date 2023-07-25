package Exercises.Concecionary;

import javax.swing.*;

public class Code {
    public Integer type;
    public Integer subtype;
    public void selling(){
        switch (type){
            case 1:{
                subtype=Integer.parseInt(JOptionPane.showInputDialog("Captiva o tracker?(1/2)"));
                switch (subtype){
                    case 1:{
                        System.out.println("Crossover compacto con estilo, versátil y cómodo para viajes familiares.");
                    }
                    case 2:{
                        System.out.println("Ágil SUV urbano con diseño moderno, ideal para aventuras urbanas.");
                    }
                }
            }
            case 2:{
                subtype=Integer.parseInt(JOptionPane.showInputDialog("Mazda 3 o Mazda 323?(1/2)"));
                switch (subtype){
                    case 1:{
                        System.out.println("Sedán deportivo, elegante y con tecnología avanzada para carreteras emocionantes.");
                    }
                    case 2:{
                        System.out.println("Compacto confiable, económico y ágil, perfecto para la movilidad urbana.");
                    }
                }
            }
            case 3:{
                subtype=Integer.parseInt(JOptionPane.showInputDialog("Duster o Clio?(1/2)"));
                switch (subtype){
                    case 1:{
                        System.out.println("SUV compacta, versátil y asequible, ideal para aventuras todoterreno.");
                    }
                    case 2:{
                        System.out.println("ompacto popular y versátil, conocido por su diseño moderno y eficiencia en combustible.");
                    }
                }
            }
        }

    }
}
