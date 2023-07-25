package Exercises.triangle;

public class Triangle {
    public Integer side1;
    public Integer side2;
    public Integer side3;
    public void equi(){
        if(side1.equals(side2)&&side2.equals(side3)){
            System.out.println("El triangulo es equilatero");
        }
        else
            System.out.println("El triangulo no es equilatero");
    }
}
