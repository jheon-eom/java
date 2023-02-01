package oop._08_dip.bad;

public class AlarmService {

    /**
     * 클라이언트가 구체화에 의존하고 있어서 생기는 문제..
     * 추상화에 의존하라고 하면... interface
     */
    private A alarmA = new A();
    private B alarmB = new B();

    /**
     * A사의 알람만 사용하다가
     * 만약 B사의 알람이 추가된다면?
     * 그런데 C, D, E사의 알람이 추가된다면 수많은 분기처리가 필요해진다.
     */
    public String beep(String company) {
        if (company.equals("A")) {
            return alarmA.beep();
        } else {
            return alarmB.beep();
        }
    }



}
