package homework;

public class SprintV2 {
    public static final int SIZE = 7;
    public static void main(String[] args) {
        dollarFigure();
    }
    public static void dollarFigure(){
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("**");
            }
            for(int j = 0; j <= SIZE - i ; j++) {
                System.out.print("$");
            }
            for (int j = 0; j <= SIZE - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= SIZE - i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= SIZE - i; j++) {
                System.out.print("$");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

    }
}
