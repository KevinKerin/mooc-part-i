public class Main {
    public static void main(String[] args) {
        
        Counter a = new Counter(5, true);
        
        System.out.println(a.value());//5
        a.decrease(1);
        System.out.println(a.value());//4
        a.decrease(3);
        System.out.println(a.value());//1
        a.decrease(5);
        System.out.println(a.value());//0
        a.increase(-2);
        System.out.println(a.value());//0
        a.increase(12);
        System.out.println(a.value());//12
        
    }
}
