
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH)+1;
        int date = Calendar.getInstance().get(Calendar.DATE);
        MyDate thisDay = new MyDate(date, month, year);
        MyDate dateBday = new MyDate(10, 4, 1993);
        MyDate laterDate = new MyDate(1, 10, 2018);
        MyDate today = new MyDate(10, 10, 2019);
        System.out.println(dateBday.differenceInYears(laterDate));
        
        Person kevin = new Person("Kevin", laterDate);
        
        System.out.println(kevin.age());
        System.out.println("date: " + date + ", month: " + month + ", year: " + year);
        System.out.println(thisDay.differenceInYears(laterDate));
        System.out.println(laterDate.differenceInYears(thisDay));
        
    }
}