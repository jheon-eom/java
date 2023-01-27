package oop._08_dip.good;

/**
 * 고수준의 모듈과 저수준의 모듈로 분리하라!
 * 고수준 모듈 : 알림
 * 저수준 모듈 : A사의 알림 서비스, B사의 알림 서비스
 */
public interface Alarm {

    String beep();

}
