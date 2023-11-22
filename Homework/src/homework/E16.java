package homework;

public class E16 {
    public static void main(String[] args) {
        slashFigure();
    }
    public static void slashFigure(){
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a <= i - 1; a++) {
                System.out.print("\\\\");
            }

            for (int b = 1; b < -2 * i + 6 * 2; b++) {
                System.out.print("!!");
            }

            for (int c = 0; c <= i - 1; c++) {
                System.out.print("//");
            }

            System.out.println();
        }

    }
}
