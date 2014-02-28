public class Function2 extends AbstractCalculateFunction {

	/** Calculate f(x) */
	@Override // Override the abstract f(x) method in the AbstractCalculateFunction class
	protected double f(double x) {
		return Math.sin(x);
	}

	/** Return the String which describes the function and the value of x, f(x) */
	@Override // Override the toString() method in the superclass
	public String toString() {
		return String.format("Function2: f(x) = sin(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}
}
