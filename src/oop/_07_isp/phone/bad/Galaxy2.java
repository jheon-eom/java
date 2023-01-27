package oop._07_isp.phone.bad;

public class Galaxy2 implements SmartPhone {

    @Override
    public String telephone() {
        return "ring ring";
    }

    @Override // 나는 이 기능을 삭제하고자 함
    public String mp3() {
        return "play mp3";
    }

    @Override
    public String internet() {
        return "connect complete!";
    }

    public String video() {
        return "play video";
    }

}
