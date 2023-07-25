package Exercises.test;

import javax.swing.*;

public class Test {
    public int Total;
    public String q1;
    public String q2;
    public String q3;
    public String q4;
    public String q5;
    public void testing(){
        if (q1.equals("a")){
            Total+=10;
        }
        if (q2.equals("a")){
            Total+=10;
        }
        if (q3.equals("b")){
            Total+=10;
        }
        if (q4.equals("a")){
            Total+=10;
        }
        if (q5.equals("b")){
            Total+=10;
        }
        System.out.println("Su puntaje final fue: "+Total);
    }
}
