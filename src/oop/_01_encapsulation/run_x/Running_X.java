package oop._01_encapsulation.run_x;

import oop._01_encapsulation.run.Runner;

public class Running_X {

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.state = "숨 차도 뛰자";
        System.out.println(runner.state);

    }

}
