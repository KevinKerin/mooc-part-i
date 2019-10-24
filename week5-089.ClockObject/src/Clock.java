public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        seconds.next();
        if(seconds.getValue() == 0){
            minutes.next();
            if(minutes.getValue() == 0){
                hours.next();
            }
        }
    }
    
    public String toString() {
        return (hours + ":" + minutes + ":" + seconds);
    }
}
