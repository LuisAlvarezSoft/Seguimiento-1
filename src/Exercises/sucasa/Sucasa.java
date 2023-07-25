package Exercises.sucasa;

import java.util.Objects;

public class Sucasa {
    public Integer price;
    public int FinalPrice;
    public String type;
    public void commission(){

        if(type.equals("nuevo")||type.equals("Nuevo")){
            FinalPrice=(price*12/100);
            System.out.println("Su inmueble es nuevo, entonces la comision es :"+FinalPrice);
        }
        else if(type.equals("usado")||type.equals("Usado")){
            FinalPrice=(price*10/100);
            System.out.println("Su inmueble es usado, entonces la comision es :"+FinalPrice);
        }
    }
}
