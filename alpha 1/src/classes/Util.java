/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import accounting.company.Date;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class Util {

    public static Date getCurrentDate() {
         Calendar cal =Calendar.getInstance();       
        cal.setTimeInMillis(System.currentTimeMillis());
        int yr,mn,dy,hr,min;
        yr= cal.get(Calendar.YEAR);
        mn=cal.get(Calendar.MONTH);
        dy=cal.get(Calendar.DAY_OF_MONTH);
        hr=cal.get(Calendar.HOUR);
        min= cal.get(Calendar.MINUTE);
       Date currentDate=new Date(dy,mn,yr);
        currentDate.setHour(hr);
        currentDate.setMinute(min);
        return currentDate;
    }


   
}
