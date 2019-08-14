import begin.Point;
import begin.Triangle;

public class Main {
    boolean numberIsPaired(int value) {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }

    boolean numbersArePlacedInAscendingOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3)
            return true;
        else
            return false;
    }

    boolean numberIsTwoDigit(int value) {
        final int MIN_TWO_DIGITAL_NUMBER = 10;
        final int MAX__TWO_DIGITAL_NUMBER = 99;
        if ((value >= MIN_TWO_DIGITAL_NUMBER) && (value <= MAX__TWO_DIGITAL_NUMBER)) {
            return true;
        } else {
            return false;
        }
    }

    boolean numberIsThreeDigit(int value) {
        final int MIN_THREE_DIGITAL_NUMBER = 100;

        final int MAX_THREE_DIGITAL_NUMBER = 999;
        if ((value >= MIN_THREE_DIGITAL_NUMBER) && (value <= MAX_THREE_DIGITAL_NUMBER)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello. User");
        //System.out.println("Input double value: ");
        Scanner scan = new Scanner(System.in);
        //double inputDoubleValue1 = scan.nextDouble();
        /*
        Car A = new Car(0.0, 60.0);
        Car B = new Car(1000.0, 50.0);
        boolean carIsConnect = false;
        int i = 0;
        while (!carIsConnect) {
            double pozCarA = A.getCurrentPosition(i);
            double pozCarB = B.getCurrentPosition(i);
            if (pozCarA >= pozCarB) {
                System.out.println(i);
                carIsConnect = true;
            }
            i++;
        }
        */
        Point A = new Point(1.0, 10.0);
        Point B = new Point(10.0, 10.0);
        Point C = new Point(10.0, 1.0);
        //Point P = new Point(1.5, 1.5);

        Triangle ABC = new Triangle(A, B, C);

        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 20; y++) {
                Point P = new Point(x, y);

                if (ABC.isPointInTriangle(P)) {
                    System.out.print("x = " + x + ", y = " + y + ". ");
                    System.out.println("Point is in triangle.");
                }
            }
        }
    }
}
