public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        setDate(day, month, year);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
           this.day = day;
        }else {
            return;
        }
    }
    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        }else {
            return;
        }
    }
    public void setYear(int year) {
        if(year >= 1 && year <= 9999) {
            this.year = year;
        }else {
            return;
        }
    }
    public void setDate(int day, int month, int year) {
        if(day >= 1 && day <= 31 && year >= 1 && year <= 9999 && month >= 1 && month <= 12) {
            this.day = day;
            this.month = month;
            this.year = year;
        }else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    @Override

    public String toString() {
        return "day=" + day + ", month=" + month + ", year=" + year;
    }
}
