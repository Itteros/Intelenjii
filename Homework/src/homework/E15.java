package homework;

public class E15 {
    public static void main(String[] args) {
        printDesign9();
    }
    public static void printDesign9() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("-");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {

                System.out.print(2 * i - 1);
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
