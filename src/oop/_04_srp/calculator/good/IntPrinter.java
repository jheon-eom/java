package oop._04_srp.calculator.good;

public class IntPrinter implements Printer {

    private int i;

    public IntPrinter(int i){
        this.i = i;
    }

    public void print() {
        System.out.println(i);
    }

}
