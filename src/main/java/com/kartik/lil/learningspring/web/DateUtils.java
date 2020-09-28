package com.kartik.lil.learningspring.web;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by kartik.hakim on 27/09/20
 */

public class DateUtils {
    // pattern:"yyyy-MM-dd"
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static Date createDateFromDateString(String dateString){
        Date date = null;
        if (null != dateString){
            try{
                date = DATE_FORMAT.parse(dateString);
            }catch (ParseException pe){
                date = new Date();
            }
        }
        else {
            date = new Date();
        }
        return date;
    }
}
