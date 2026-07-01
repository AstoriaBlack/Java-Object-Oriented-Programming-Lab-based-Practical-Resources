public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    public void setDate(int day, int month, int year) {
        if(year >=1000 && year<=9999 ) {
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if(day >= 1 && day <= 31) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                } else {
                    throw new IllegalArgumentException("Invalid date format");
                }
            } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                if(day >= 1 && day <= 31) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }else
                    throw new IllegalArgumentException("Invalid date format");
            }else if (month == 2) {
                if(day >= 1 && day <= 31) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }else {
                    throw new IllegalArgumentException("Invalid date format");
                }
            }else {
                throw new IllegalArgumentException("Invalid date format");
            }
        }else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }


}
