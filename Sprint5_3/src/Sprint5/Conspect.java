package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
import java.util.Scanner;

public class Conspect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Меню завдань");
            System.out.println("1.Завдання");
            System.out.println("2.Завдання");
            System.out.println("3.Завдання");
            System.out.println("4.Завдання");
            System.out.println("5.Завдання");
            System.out.println("6.Завдання");
            System.out.println("7.Завдання");
            System.out.println("8.Завдання");
            System.out.println("9.Завдання");
            System.out.println("10.Завдання");
            System.out.println("11.Вихід");
            System.out.println("Введіть номер завдання:");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    for (int i = 1; i <= 6; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    for (int i = 1; i <= 10; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                ///////////////////////////////////////////////////////////////
                case 2:
                    int lineWidth = 6;
                    for (int i = 1; i <= lineWidth; i++) {
                        System.out.print("*");
                    }
                    System.out.println();

                    lineWidth = 10;
                    for (int i = 1; i <= lineWidth; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                ///////////////////////////////////////////////////////////////
                case 3:
                    drawLine(6);
                    System.out.println();
                    drawLine(10);
                    System.out.println();
                    break;
                ///////////////////////////////////////////////////////////////
                case 4:
                    drawLine2(6, "#");
                    System.out.println();
                    drawLine2(11, "-");
                    System.out.println();
                    drawLine2(3, "+");
                    System.out.println();
                    break;
                ///////////////////////////////////////////////////////////////
                case 5:
                    drawLine3(5, "+", "|", "o");
                    System.out.println();
                    drawLine3(9, "+", "|", "o");
                    System.out.println();
                    drawLine3(11, "+", "|", "o");
                    System.out.println();
                    drawLine3(8, "+", "|", "o");
                    System.out.println();
                    drawLine3(3, "+", "|", "o");
                    System.out.println();
                    break;
                ///////////////////////////////////////////////////////////////
                case 6:
                    double x = 31.45;
                    double y = 49.0;

                    double f = (1.0 / 2.0) * Math.sin(x - Math.PI / Math.sqrt(y));
                    System.out.println("For x = " + x + " and y = " + y + " result calculation \nby formula (x,y)=... equals " + f);
                    break;
                ///////////////////////////////////////////////////////////////
                case 7:
                    mathOne();
                    break;
                ///////////////////////////////////////////////////////////////
                case 8:
                    mathTwo();
                    break;
                ///////////////////////////////////////////////////////////////
                case 9:
                    mathThree();
                    break;
                ///////////////////////////////////////////////////////////////
                case 10:
                    System.out.println("First roll = " + diceRoll());
                    System.out.println("Second roll = " + diceRoll());
                    System.out.println("Third roll = " + diceRoll());
                    break;
                case 11:
                    System.out.println("Программа закінчена");
                    break;
                default:
                    System.out.println("I dont know");
                    break;
            }
        } while (number != 11);
    }

    public static int diceRoll(){
        int dice = 1 + (int)(Math.random()*6);
        return dice;
    }

    public static void drawLine(int lineWidth){
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
    public static void drawLine2(int lineWidth, String sym){
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print(sym);
        }
    }
    public static void drawLine3(int lineWidth, String sym, String startSym, String endSym){
        System.out.print(startSym);

        for (int i = 2; i <= lineWidth ; i++) {
            System.out.print(sym);
        }
        System.out.print(endSym);
    }
    public static void mathOne(){
        System.out.println(Math.toDegrees(Math.PI / 2)); //ret 90.0
        System.out.println(Math.toRadians(30)); //ret 0.5236
        System.out.println(Math.sin(0)); //ret 0.0
        System.out.println(Math.sin(Math.toRadians(270))); //ret -1.0
        System.out.println(Math.sin(Math.PI / 6)); //ret 0.5
        System.out.println(Math.sin(Math.PI / 2)); //ret 1.0
        System.out.println(Math.cos(0)); //ret 1.0
        System.out.println(Math.cos(Math.PI / 6)); //ret 0.866
        System.out.println(Math.cos(Math.PI / 2)); //ret 0
        System.out.println(Math.asin(0.5)); //ret 0.523598333
    }

    public static void mathTwo(){
        System.out.println(Math.ceil(2.1)); //ret 3.0
        System.out.println(Math.ceil(2.0)); //ret 2.0
        System.out.println(Math.ceil(-2.0)); //ret -2.0
        System.out.println(Math.ceil(-2.1)); //ret -3.0

        System.out.println(Math.floor(2.1)); //ret 2.0
        System.out.println(Math.floor(2.0)); //ret 2.0
        System.out.println(Math.floor(-2.0)); //ret -2.0
        System.out.println(Math.floor(-2.1)); //ret -3.0

        System.out.println(Math.rint(2.1)); //ret 2.0
        System.out.println(Math.rint(-2.0)); //ret -2.0
        System.out.println(Math.rint(-2.1)); //ret -2.0
        System.out.println(Math.rint(2.5)); //ret 2.0
        System.out.println(Math.rint(3.5)); //ret 4.0
        System.out.println(Math.rint(-2.5)); //ret -2.0

        System.out.println(Math.round(2.6f)); //ret 3
        System.out.println(Math.round(2.0)); //ret 2
        System.out.println(Math.round(-2.0f)); //ret -2
        System.out.println(Math.round(-2.6)); //ret -3
        System.out.println(Math.round(-2.4)); //ret -2
    }

    public static void mathThree(){
        System.out.println(Math.max(2, 3)); // ret 3
        System.out.println(Math.max(2.5, 3)); // ret 3.0
        System.out.println(Math.min(2.5, 3.6)); // ret 2.5
        System.out.println(Math.abs(-2)); // ret 2
        System.out.println(Math.abs(-2.1)); // ret 2.1
    }
}
