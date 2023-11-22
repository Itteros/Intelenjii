package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
public class Distance {
    public static void main(String[] args) {
        int x1 = 10 ;
        int y1 = 2 ;
        int x2 = 3 ;
        int y2 = 15;
        double result = distance(x1,y1,x2,y2);
        System.out.println(result);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.pow((x2-x1),2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(d);
    }
}
