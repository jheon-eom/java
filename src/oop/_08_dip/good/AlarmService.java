package oop._08_dip.good;

public class AlarmService {

    // 학습 내용에 final은 상관 없음
    private final Alarm alarm; // 추상화에 의존

    public AlarmService(Alarm alarm) {
        this.alarm = alarm;
    }

    /**
     * 알람서비스는 서비스하는 회사가 바뀐다 한들 코드를 수정할 일이 없어짐
     */
    public String beep() {
        return alarm.beep();
    }

}
