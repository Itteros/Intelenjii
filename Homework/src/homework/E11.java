package homework;

public class E11 {
    public static final int VALUE = 10;
    public static final int NUMBER_OF_DIGITS = 4;
    public static final int VALUE2 = 7;
    public static final int NUMBER_OF_DIGITS2 = 8;
    public static void main(String[] args) {
        constants();
    }
    public static void constants() {
        for (int i = 0; i < VALUE; i++) {
            for (int j = 0; j < NUMBER_OF_DIGITS; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < VALUE; i++) {
            for (int j = 1; j < NUMBER_OF_DIGITS + 1; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
        System.out.println();
        for (int i = 0; i < VALUE2; i++) {
            for (int j = 0; j < NUMBER_OF_DIGITS2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < VALUE2; i++) {
            for (int j = 1; j < NUMBER_OF_DIGITS2 + 1; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
