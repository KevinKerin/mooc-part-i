import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    int year = Calendar.getInstance().get(Calendar.YEAR);
    int month = Calendar.getInstance().get(Calendar.MONTH)+1;
    int date = Calendar.getInstance().get(Calendar.DATE);
    MyDate currentDate = new MyDate(date, month, year);
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name){
        this.name = name;
        this.birthday = currentDate;
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    
    public int age() {
       return currentDate.differenceInYears(birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public boolean olderThan(Person compared){
        return birthday.earlier(compared.birthday);
    }
}
