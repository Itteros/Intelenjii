package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
public class Fibonacchi {
    public static void main(String[] args) {
        System.out.println("Month No \t Number of Pairs");
        System.out.println("_________________________");
        for (int i = 1; i <= 7; i++) {
            int result = fibonacchi(i);
            System.out.print("|");
            for (int j = 0; j < 1; j++) {
                System.out.print("\t" + i);
                for (int k = 0; k < 15; k++) {
                    System.out.print(" ");

                }
            }
            for (int k = 0; k < 1; k++) {
                System.out.print(result + "\t");
            }
            System.out.println("|");

        }
        System.out.println("_________________________");


    }

    public static int fibonacchi(int n) {
        double Fn = 1 / Math.sqrt(5) * Math.abs(Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n));
        return (int)Fn;
    }
}
