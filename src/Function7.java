
public class Function7 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return Math.log10(x) + Math.pow(x, 2);
	}

	@Override
	public String toString() {
		return String.format("Function7: f(x) = log(x) + x^2\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}
}
