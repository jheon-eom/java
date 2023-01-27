package oop._07_isp.phone.good;

public class Galaxy1 implements Galaxy1Function, SmartPhone {

    @Override
    public String telephone() {
        return "ring ring";
    }

    @Override
    public String mp3() {
        return "play mp3";
    }

    @Override
    public String internet() {
        return "connect complete!";
    }

}
