package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
public class SumOfDice {

    public static void main(String[] args) {
        int result = sumOfTwoDice();
        System.out.println("Результат підкидання: " + result);
    }

    public static int sumOfTwoDice() {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        return sum;
    }
}
