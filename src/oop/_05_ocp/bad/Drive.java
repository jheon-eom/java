package oop._05_ocp.bad;

public class Drive {

    void drive(Sonata sonata) {
        sonata.run();
        sonata.stop();
    }

    void drive(Avante avante) {
        avante.run();
        avante.stop();
    }

}
