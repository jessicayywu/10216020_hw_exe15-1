public abstract class AbstractCalculateFunction {
	private double x;
	
	/** Set x */
	public void setX(double x) {
		this.x = x;
	}
	
	/** Return x */
	public double getX() {
		return x;
	}
	
	/** Return the String which describes the value of x */
	@Override // Override the toString() method in the superclass
	public String toString() {
		return String.format("x = %.2f", getX());
	}
	
	/** Calculate f(x) */
	protected abstract double f(double x); // Implemented in the subclasses
}
