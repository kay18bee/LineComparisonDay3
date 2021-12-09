package LineComparison;

import java.util.Scanner;

public class LineComparisonUC2 {
	

	public int Cal_Length(double a, double b, double c, double d){
		double First_operation= Math.pow((c-a),2)+Math.pow((d-b),2);
	    double Second_operation= Math.sqrt(First_operation);
	    System.out.println(Second_operation);
		return 0;
	}
	
	public static void main(String[] args) {
	    
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the x and y co-ordinates of the starting point of the first line respectively.");
		    double x1 = sc.nextDouble();
		    double y1 = sc.nextDouble();
		    System.out.println("Enter the x and y coordinates of the end point of the first line respectively.");
		    double x2 = sc.nextDouble();
		    double y2 = sc.nextDouble();
		    LineComparisonUC2 l1= new LineComparisonUC2();
		    int X = l1.Cal_Length(x1, y1, x2, y2);
		    System.out.println("Enter the x and y co-ordinates of the starting point of the second line respectively.");
		    double a1 = sc.nextDouble();
		    double b1 = sc.nextDouble();
		    System.out.println("Enter the x and y coordinates of the end point of the second line respectively.");
		    double a2 = sc.nextDouble();
		    double b2 = sc.nextDouble();
		    LineComparisonUC2 l2= new LineComparisonUC2();
		    int Y = l2.Cal_Length(a1, b1, a2, b2);
	        System.out.println("lengths of the lines are: " + X + Y  );
	}

}
