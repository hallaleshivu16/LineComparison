package LineComparison;
import java.util.*;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class UC1lineLengthCalculation {

    public static void main(String[] args) {
        double lineLength = 0;
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the values for x1, y1, x2, y2");
        int x1 = rd.nextInt();
        int y1 = rd.nextInt();
        int x2 = rd.nextInt();
        int y2 = rd.nextInt();
        lineLength = Math.sqrt(((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
        System.out.println("Line Length is:" +lineLength);
    }
}