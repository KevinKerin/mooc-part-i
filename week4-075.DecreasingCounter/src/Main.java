public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        DecreasingCounter count = new DecreasingCounter(2);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.printValue();
        
        
        count.printValue();
        count.decrease();
        count.printValue();
        count.decrease();
        count.printValue();
        count.decrease();
        count.printValue();
        count.setInitial();
        count.printValue();
        count.reset();
        count.printValue();
               
                
               
    }
}
