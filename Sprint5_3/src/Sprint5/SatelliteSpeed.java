package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
public class SatelliteSpeed {
    public static void main(String[] args) {
        double radiusEarth = 6.3781 * Math.pow(10,6);
        double telescopHubble = 6.98 * Math.pow(10,6);
        System.out.println("Швидкість руху Хаббла від центру Землі: " + satelliteSpeed(telescopHubble));
        System.out.println("Швидкість руху Хаббла від поверхні: " + satelliteSpeed(telescopHubble - radiusEarth));
    }

    public static double satelliteSpeed(double r) {
        final double M = 5.98 * Math.pow(10,24);
        final double Ge = 6.67 * Math.pow(10,-11);
        return Math.sqrt((M*Ge)/r);
    }
}
