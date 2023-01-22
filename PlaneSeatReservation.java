package PlaneSeatReservation;
import java.awt.*;

public class PlaneSeatReservation {
	static void wc() {
		System.out.println("Welcome to Plane Seat Reservation!");
		System.out.println("        __|__\n*--o--o--(_)--o--o--*");
	}
	static int plusMethodInt(int x, int y) {
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
	static void rc() throws Exception{
		java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
	}
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }
	public static void main(String []args) throws Exception {
		int myNum1 = plusMethodInt(8, 5);
		int result = sum(10);
		double myNum2 = plusMethodDouble(4.3, 6.26);
		wc();
		rc();
		 
	 }
}
