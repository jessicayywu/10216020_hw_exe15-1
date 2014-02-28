public class Function7 extends AbstractCalculateFunction {
	/** Calculate f(x) */
	@Override // Override the abstract f(x) method in the AbstractCalculateFunction class
	protected double f(double x) {
		return Math.log10(x) + Math.pow(x, 2);
	}

	/** Return the String which describes the function */
	@Override // Override the toString() method in the superclass
	public String toString() {
		return "Function7: f(x) = log(x) + x^2";
	}
}
