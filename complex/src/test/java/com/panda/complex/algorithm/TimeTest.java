package com.panda.complex.algorithm;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {

    @Test
    public void getTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String s = "20210501";
        String e = "20210630";

        Calendar calendar = Calendar.getInstance();
//        String nowDate = sdf.format(new Date());
        calendar.setTime(sdf.parse(s));
        calendar.add(Calendar.MONTH,-1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        String afterOneMonth = sdf.format(calendar.getTime());


        System.out.println(afterOneMonth);

    }
}
