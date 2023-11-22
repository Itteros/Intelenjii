package Sprint5;
/*КНД - 11
  Спрінт 5
  Шаманський Ігор
 */
public class DayWeek {
    public static void main(String[] args) {
        int m = 11;
        int d = 19;
        int y = 2023;
        int result = dayOfWeek(m,d,y);
        if (result == 1) {
            System.out.println(result + " is Monday");
        } else if (result == 2) {
            System.out.println(result + " is Tuesday");
        } else if (result == 3) {
            System.out.println(result + " is Wednesday");
        } else if (result == 4) {
            System.out.println(result + " is Thursday");
        } else if (result == 5) {
            System.out.println(result + " is Friday");
        } else if (result == 6) {
            System.out.println(result + " is Saturday");
        } else if (result == 0) {
            result+=7;
            System.out.println(result + " is Sunday");
        } else {
            System.out.println("Something Wrong");
        }

//        switch(result) {
//            case (1):
//                System.out.println(result + " is Monday");
//                break;
//            case (2):
//                System.out.println(result + " is Tuesday");
//                break;
//            case (3):
//                System.out.println(result + " is Wednesday");
//                break;
//            case (4):
//                System.out.println(result + " is Thursday");
//                break;
//            case (5):
//                System.out.println(result + " is Friday");
//                break;
//            case (6):
//                System.out.println(result + " is Saturday");
//                break;
//            default:
//                result+=7;
//                System.out.println(result + " is Sunday");
//                break;
//        }


    }
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31* m0 / 12) % 7;
        return d0;
    }
}

