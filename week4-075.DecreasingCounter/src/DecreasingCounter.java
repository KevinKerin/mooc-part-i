public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int valueAtStart;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueAtStart = value;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(value > 0){
            value--;
        }
    }

    public void reset(){
        value = 0;
    }
    
    public void setInitial(){
        value = valueAtStart;
    }
}
