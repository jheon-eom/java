package oop._08_dip.bad;

public class AlarmService {

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
