public abstract class AbstractCalculateFunction {
	private double x;
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	@Override
	public String toString() {
		return String.format("x = %.2f", getX());
	}
	
	protected abstract double f(double x);
}
