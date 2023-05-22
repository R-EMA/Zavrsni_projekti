package mvca;

/*
 * jednostavan digitron
 */
public class Racunaljka {
	
	double x;
	double y;
	
	Racunaljka(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	Racunaljka() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double zbir() {
		return x + y;
	}

	public double razlika() {
		return x - y;
	}
	
	public double proizvod() {
		return x * y;
	}
	
	public double kolicnik() {
		if(x == 0 || y == 0) 
			return 0.0;
		else
			return x / y;
	}

	// x
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	// y
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
