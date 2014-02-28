public class Function4 extends AbstractCalculateFunction {
	/** Calculate f(x) */
	@Override // Override the abstract f(x) method in the AbstractCalculateFunction class
	protected double f(double x) {
		return Math.tan(x);
	}
	
	/** Return the String which describes the function */
	@Override // Override the toString() method in the superclass
	public String toString() {
		return "Function4: f(x) = tan(x)";
	}

}
