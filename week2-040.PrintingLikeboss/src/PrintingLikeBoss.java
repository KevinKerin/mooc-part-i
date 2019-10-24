public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }      
        System.out.println("\r");
    }

    public static void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while(size > 0){
            printWhitespaces(size-1);
            printStars(stars);
            size--;
            stars++;
        }
    }

    public static void xmasTree(int height) {
        int stars = 1;
        int stand = height - 2;
        while(height > 0){
            printWhitespaces(height - 1);
            printStars(stars);
            stars = stars + 2;
            height--;
        }
        for (int i = 0; i < 2; i++) {
            printWhitespaces(stand);
            printStars(3);
        }
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(8);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
