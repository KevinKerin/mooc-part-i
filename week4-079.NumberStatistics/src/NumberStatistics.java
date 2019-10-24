
public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum = 0;
    
    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(amountOfNumbers == 0){
            return 0;
        } else {
            return ((double) sum / amountOfNumbers);
        }
    }
    
    
}