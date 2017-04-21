/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arles Cerrato
 */
public class DatePerson {
    
    private int day;
    private int month;
    private int years;
    private String description;

    public DatePerson() {
    }

    public DatePerson(int day, int month, int years, String description) {
        this.day = day;
        this.month = month;
        this.years = years;
        this.description = description;
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
