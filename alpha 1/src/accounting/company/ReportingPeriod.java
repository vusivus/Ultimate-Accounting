/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.company;

import java.time.Month;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class ReportingPeriod {
private String startDate;
private String endDate;
private int periodNumber;
String month;

    public ReportingPeriod(String startDate, String endDate, String month) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public void setPeriodNumber(int periodNumber) {
        this.periodNumber = periodNumber;
    }

}
