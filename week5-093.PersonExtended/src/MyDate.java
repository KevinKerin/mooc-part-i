
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared){
        if(compared.earlier(this)){//eg. compared == 1/10/2018, this == 10/10/2019
            int difference = this.year - compared.year;//age is now 1
            if(this.month < compared.month){
                difference--;
            } else if(this.month == compared.month){//if months are the same,
                if(this.day < compared.day){//if this.day(10) is less than compared.day(1)
                    difference--;//it's less than one year
                }
            }
            return difference;
        } else if(this.equals(compared)){
            return 0;
        } else {
            return compared.differenceInYears(this);
        }
    }  

  
}
