package LineComparison;

import java.util.Objects;
import java.util.Scanner;

public class UC3LineComparisonByEndPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length [] = new double[2];
//        taking inputs
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the values for Line:" + (i + 1) + " x1, y1, x2, y2");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
//            calculating length of the line and storing in length array
            length[i] = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            System.out.println("Length of line " + (i + 1) + ": " + length[i]);
        }
//        comparing the length of two lines
        if(Objects.equals(length[0], length[1])){
            System.out.println("The length of two lines are equal.");
        }
        else if(length[0] > (length[1])){
            System.out.println("Length of line 1 is greater than the length of line 2");
        }
        else{
            System.out.println("Length of line 2 is greater than the length of line 1");
        }
    }
}
