package LineComparison;

import java.lang.Math;
import java.util.Scanner;


public class LineComparisonUC1 {
	
	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x and y co-ordinates of the starting point of the line respectively.");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    System.out.println("Enter the x and y coordinates of the end point of the line respectively.");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    double First_operation= Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
    double Second_operation= Math.sqrt(First_operation);
    System.out.println("The length of the line is= "+Second_operation);	
	}

}
