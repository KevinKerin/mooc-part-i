public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate compared){
        if(compared.earlier(this)){
            int difference = 0;

            difference += this.year - compared.year;
            if(this.month < compared.month){
                difference--;
            } else if(this.month == compared.month){
                if(this.day < compared.day){
                    difference--;
                }
            }
            return difference;
        } else {
            return compared.differenceInYears(this);
        }
    }  
}
