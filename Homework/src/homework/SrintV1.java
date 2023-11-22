package homework;

public class SrintV1 {
    public static final int SIZE = 6;
    public static void main(String[] args) {
       starFigure();
    }
    public static void starFigure() {
        for (int i = 1; i < SIZE; i++) {
            for (int j = 0; j < (SIZE - i - 1) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 8; j < (i*2) * 4; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (SIZE - i - 1) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
