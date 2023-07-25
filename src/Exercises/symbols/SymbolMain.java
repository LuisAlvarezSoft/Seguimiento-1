package Exercises.symbols;

public class SymbolMain {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        symbol.start=0;
        symbol.x="* * * * * * ==================================";
        symbol.y="* * * * * ==================================";
        symbol.finish="* * * * * * ==================================\n" +
                "===========================================";
        symbol.printing();
    }
}
