package oop._08_dip.good;

import oop._08_dip.good.AlarmService;

public class AlarmConfig {

    public AlarmService alarmService() {
        return new AlarmService(new B());
    }

}
