/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.company;

/**
 *
 * @author Electronics
 */
public class Date {

    private int hour;
    private int minute;
    private int day;
    private int month;
    private int year;
    static int JANUARY = 1;
    static int FEBRUARY = 2;
    static int MARCH = 3;
    static int APRIL = 4;
    static int MAY = 5;
    static int JUNE = 6;
    static int JULY = 7;
    static int AUGUST = 8;
    static int SEPTEMBER = 9;
    static int OCTOBER = 10;
    static int NOVEMBER = 11;
    static int DECEMBER = 12;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getDate(){
        return day+"/"+month+"/"+year;
    }
    public String getTime(){
        return hour+":"+minute;
    }
}
