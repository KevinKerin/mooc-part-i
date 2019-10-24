public class Printing {

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }      
        System.out.println("\r");
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);          
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            printStars(count);
            count++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        printStars(5);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(8);
        System.out.println("\n---");
    }

}
