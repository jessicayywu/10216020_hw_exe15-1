public class Function1 extends AbstractCalculateFunction {
	
	@Override
	protected double f(double x) {
		return Math.pow(x, 2);
	}
	
	@Override
	public String toString() {
		return String.format("Function1: f(x) = x^2\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}

}
