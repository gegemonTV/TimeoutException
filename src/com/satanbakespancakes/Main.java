package com.satanbakespancakes;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.time.Clock;
import java.util.TimeZone;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static java.time.Clock.systemUTC;

public class Main {

    public static void main(String[] args) throws TimeoutException {
	// write your code here
        Clock clock = systemUTC();
        while (true){
            if (System.currentTimeMillis() > 161){
                throw new TimeoutException("Дедлайн сгорел...");//, new TimeoutThrowable());
            }
        }

    }
}
