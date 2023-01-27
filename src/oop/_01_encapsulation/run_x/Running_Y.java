package oop._01_encapsulation.run_x;

import oop._01_encapsulation.run.Runner;

public class Running_Y extends Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.state = "숨이 차네";

        System.out.println(runner.state);
    }

}
