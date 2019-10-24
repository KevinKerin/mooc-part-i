
public class Main {

    public static void main(String[] args) {
        
        NightSky nightSky = new NightSky(0.2, 10, 10);
        
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        
        
    }
}
