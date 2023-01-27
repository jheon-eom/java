package oop._07_isp.game.bad;

public class Player {

    private Game game = new Nexon();

    /**
     * 플레이어는 스포츠 게임만을 하고 싶지만,
     * 그에 비해 너무 많은 유형의 게임이 제공되고 있음
     */

    void playing() {
        game.sports();
    }

}
