public class Function3 extends AbstractCalculateFunction {
	/** Calculate f(x) */
	@Override // Override the abstract f(x) method in the AbstractCalculateFunction class
	protected double f(double x) {
		return Math.cos(x);
	}

	/** Return the String which describes the function */
	@Override // Override the toString() method in the superclass
	public String toString() {
		return "Function3: f(x) = cos(x)";
	}
}
