package oop._05_ocp.bad;

public class Drive {

    /**
     * 만약 드라이버가 차릍 바꿔서 타고 싶다면, 매번 새로운 차를 생성해야 함
     */
    public void avanteDriving() {
        Avante avante = new Avante();
        avante.run();
        avante.stop();
    }

    public void sonataDriving() {
        Sonata sonata = new Sonata();
        sonata.run();
        sonata.stop();
    }

}
