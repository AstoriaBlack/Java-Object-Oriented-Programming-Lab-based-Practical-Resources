/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateProject;

/**
 *
 * @author b.villarini
 */
public class Date {
     private int year;
    private int month;
    private int day;
    
    public Date(int day, int month, int year){
        if ((year > 1939) && (year<2099) && (month > 0) && (month<13) && (day > 0) && (day<32)){
            this.day = day;
            this.month = month;
            this.year = year;
        }  
        else{
            System.out.println("Not correct date");
        }
}
    public void setYear(int year){
        if ((year > 1939) && (year<2099)){
        this.year = year;
        }
        else{
            System.out.println("Not correct range");
        }   
    }
    
    public void setMonth(int month){
        if ((month > 0) && (month<13)){
            this.month = month;
        }else{
            System.out.println("Not correct range");
        }
    }
    
    public void setDay(int day){
        if ((day > 0) && (day<32)){
            this.day = day;
        }else{
            System.out.println("Not correct range");
        }
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }

    public String getDate(){
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }
    
    public String toString(){
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }

    //---new method---
    //advances the date forward by the given number of days
    //correctly rolling over into new months/years
    public void addDays(int days){
        day +=days ;

        // Keep rolling into the next month as long as 'day' overflows
        // the number of days the current month actually has.
        while(day > daysInMonth(month,year)) {
            day -= daysInMonth(month, year);//subtract this month's length
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    //Helper: hoe many days are in a given month/year (accounts for leap years)
    private int daysInMonth(int month, int year){
        int[] lengths = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(month == 2 && isLeapYear(year)) {
            return 29;
        }
        return lengths[month - 1];
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
